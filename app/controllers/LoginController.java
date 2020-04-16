package controllers;
import models.User;
import org.slf4j.*;
import play.mvc.*;
import play.data.*;
import play.i18n.MessagesApi;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;

@Singleton
public class LoginController extends Controller {

    private Form<LoginData> loginForm;
    private Form<NewUserData> newUserForm;
    private MessagesApi messagesApi;
    private ArrayList<User> users;
    private String errorMessage = " ";
    private final Logger logger = LoggerFactory.getLogger(getClass()) ;
    private static User currentUser = null;
	private static String userIn = null;
	private static String passIn = null;

    @Inject
    public LoginController(FormFactory formFactory, MessagesApi messagesApi) {
        this.loginForm = formFactory.form(LoginData.class);
        this.newUserForm = formFactory.form(NewUserData.class);
        this.messagesApi = messagesApi;
        this.users = com.google.common.collect.Lists.newArrayList(new User("Test User", "Password"));
    }

    public Result index() {
        errorMessage = " ";
        return ok(views.html.index.render(loginForm, errorMessage));
    }

    public Result openNewUserPage(Http.Request request){ return ok(views.html.newUser.render(newUserForm, request, messagesApi.preferred(request))); }

    public Result authenticateUser(Http.Request request)throws Exception{
        final Form<LoginData> boundForm = loginForm.bindFromRequest(request);
        ArrayList<User> tempList = getUserList();
        if (boundForm.hasErrors()) {
            logger.error("errors = {}", boundForm.errors());
            return badRequest(views.html.index.render(boundForm, errorMessage));
        } else {
            LoginData data = boundForm.get();
            String selectedUsername = data.getUsername();
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM user_info WHERE userid LIKE '"+selectedUsername+"';");
            while(rs.next()){
			String loadedUsername = rs.getString("userid");
                if (loadedUsername.equals(selectedUsername)){
					this.userIn = loadedUsername;
                    String loadedPassword = rs.getString("password");
                    String selectedPassword = data.getPassword();
                    if (loadedPassword.equals(selectedPassword)){
						this.passIn = loadedPassword;
                        return redirect(routes.FavoritesController.getFavorites());
                    } else {
                        errorMessage = "Wrong Password";
                    }
                } else {
                    errorMessage = "Wrong Username";
                }
			}
        }
        return ok(views.html.index.render(boundForm, errorMessage));
    }

    public Result createUser(Http.Request request) throws Exception{
        final Form<NewUserData> boundForm = newUserForm.bindFromRequest(request);
        if (boundForm.hasErrors()) {
            logger.error("errors = {}", boundForm.errors());
            return badRequest(views.html.newUser.render(boundForm, request, messagesApi.preferred(request)));
        } else {
            NewUserData data = boundForm.get();
			String nUser = data.getUsername();
			String nFirst = data.getFirstName();
			String nLast = data.getLastName();
			String nPass = data.getPassword();
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			stmt.executeUpdate("INSERT INTO user_info(userid, firstname, lastname, password) VALUES ('"+nUser+"','"+nFirst+"','"+nLast+"','"+nPass+"')");
            return redirect(routes.LoginController.index());
        }
    }
	
	private static Connection getConnection() throws URISyntaxException, SQLException {
		String username = "mtf5153@gmail.com";
		String password = "P057gress";
		String dbUrl = "jdbc:postgresql://ec2-54-225-113-7.compute-1.amazonaws.com:5432/d119ssb4iakdsc?user=vfcfghzymoxawj&password=611e2e2d4783d72a83de3221ab6eb206935af5c22598b74cd491170a3b860824&sslmode=require";

		return DriverManager.getConnection(dbUrl, username, password);
	}

    public ArrayList<User> getUserList(){ return users; }

    public static User getCurrentUser(){ return currentUser;   }
	
	public static String getUserIn(){ return userIn; }
	
	public static String getPassIn(){ return passIn; }
}
