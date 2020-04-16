package controllers;

import org.slf4j.*;
import play.data.*;
import play.libs.ws.*;
import play.mvc.*;
import play.i18n.MessagesApi;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.Inject;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletionStage;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.sql.*;
import static play.libs.Scala.asScala;
import models.User;
import models.Media;
import models.FilterList;

public class FavoritesController extends Controller implements WSBodyReadables, WSBodyWritables {
    private final WSClient ws;
    private final Form<MediaData> form;
    private final Form<FilterList> filterForm;
    private MessagesApi messagesApi;
    private final List<Media> mediaList;
    private List<Media> favoritesList;
    private final Logger logger = LoggerFactory.getLogger(getClass());
    JsonNode selectedNode = null;
    String selectedName = "Please Select A Piece of Media";
    String selectedType = null;
    String selectedDescription= null;
    String selectedWurl = null;
    String selectedVurl = null;

    User currentUser;
    private Form<PasswordData> passwordDataForm;
    private String errorMessage = " ";

    @Inject
    public FavoritesController(FormFactory formFactory, MessagesApi messagesApi, WSClient ws) {
        this.form = formFactory.form(MediaData.class);
        this.filterForm = formFactory.form(FilterList.class);
        this.messagesApi = messagesApi;
        this.ws = ws;
        this.mediaList = com.google.common.collect.Lists.newArrayList(
                new Media("Movie 1", "movie", "", "", "", ""),
                new Media("Book 1", "book", "", "", "", ""),
                new Media("Book 2", "book", "", "", "", "")
        );
        this.favoritesList = com.google.common.collect.Lists.newArrayList();
        this.passwordDataForm = formFactory.form(PasswordData.class);
    }

    public Result getFavorites(Http.Request request) {
        errorMessage = " ";
        loadCurrentUser();
        return ok(views.html.filterMenu.render(asScala(mediaList), form, filterForm, selectedName, selectedType, selectedDescription, selectedWurl, selectedVurl, request, messagesApi.preferred(request)));
    }

    private void loadCurrentUser(){
        this.currentUser = LoginController.getCurrentUser();
    }

    public Result addFavorite(Http.Request request) {
        String returnString = "";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonResponse = null;
        String query = request.body().asText();
        try {
            String requestUrl = "https://tastedive.com/api/similar?k=333817-Mediamap-LTWXMSU3&limit=5&info=1&q="
                    + query;
            WSRequest wsRequest = ws.url(requestUrl).setContentType("application/x-www-form-urlencoded");
            System.out.println(requestUrl);
            CompletionStage<JsonNode> responsePromise = wsRequest.get().thenApply(r -> r.getBody(json()));
            jsonResponse = responsePromise.toCompletableFuture().get();
            JsonNode jsonOrigin = jsonResponse.get("Similar").get("Info");
            if (jsonOrigin.isArray()) {
                for (JsonNode media : jsonOrigin) {
                    boolean alreadyFavorited = false;
                    Media m = mapper.treeToValue(media, Media.class);
                    for (Media mCompare : favoritesList) {
                        if ((mCompare.getName() + mCompare.getType()).equals(m.getName() + m.getType())) {
                            alreadyFavorited = true;
                        }
                    }
                    if (!alreadyFavorited) {
                        favoritesList.add(m);
                    }
                }
            }
            return ok(jsonOrigin);
        } catch (java.lang.Exception exception) {
            return ok(exception.getMessage());
        }
    }

    public Result getFavoritesList(Http.Request request) {
        return ok(views.html.favoritesList.render(asScala(favoritesList)));
    }

    public Result removeFavorite(Http.Request request) {
        String mediaID = request.body().asText();
        for (Media m : favoritesList) {
            if (mediaID.equals(m.getName() + m.getType())) {
                favoritesList.remove(m);
                return ok("Removed from favorites");
            }
        }
        return ok();
    }

    public Result getSearchResults(String query) {
        String returnString = "";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonResponse = null;
        try {
            String requestUrl = "https://tastedive.com/api/similar?k=333817-Mediamap-LTWXMSU3&limit=5&info=1&q="
                    + query;
            WSRequest wsRequest = ws.url(requestUrl).setContentType("application/x-www-form-urlencoded");
            System.out.println(requestUrl);
            CompletionStage<JsonNode> responsePromise = wsRequest.get().thenApply(r -> r.getBody(json()));
            jsonResponse = responsePromise.toCompletableFuture().get();
            return ok(jsonResponse.toString());
        } catch (java.lang.Exception exception) {
            return ok(exception.getMessage());
        }
    }

    public Result changePassword(Http.Request request) throws Exception{
        final Form<PasswordData> boundForm = passwordDataForm.bindFromRequest(request);
        PasswordData data = boundForm.get();
        if (boundForm.hasErrors()) {
            logger.error("errors = {}", boundForm.errors());
            return badRequest(views.html.changePasswordUI.render(boundForm, errorMessage, request, messagesApi.preferred(request)));
        } else {
			String userIn = LoginController.getUserIn();
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM user_info WHERE userid LIKE '"+userIn+"';");
			while(rs.next()){
            String currentPassword = rs.getString("password");
            String newPassword = data.getNewPassword();
            String newPasswordCheck = data.getNewPasswordCheck();
            if (currentPassword.equals(data.getCurrentPassword())){
                if(newPassword.equals(newPasswordCheck)){
                    stmt.executeUpdate("UPDATE user_info SET password = '"+newPassword+"' WHERE userid = '"+userIn+"';");
                    return redirect(routes.FavoritesController.getFavorites());
                } else {
                    errorMessage = "Your New Password Does Not Match";
                }
            }
            else{
                errorMessage = "Your Current Password Is Incorrect";
            }
			}

        }
        return ok(views.html.changePasswordUI.render(boundForm, errorMessage, request, messagesApi.preferred(request)));
    }

    public Result openChangePasswordPage(Http.Request request){
        return ok(views.html.changePasswordUI.render(passwordDataForm, errorMessage, request, messagesApi.preferred(request)));
    }
	
	private static Connection getConnection() throws URISyntaxException, SQLException {
		String username = "mtf5153@gmail.com";
		String password = "P057gress";
		String dbUrl = "jdbc:postgresql://ec2-54-225-113-7.compute-1.amazonaws.com:5432/d119ssb4iakdsc?user=vfcfghzymoxawj&password=611e2e2d4783d72a83de3221ab6eb206935af5c22598b74cd491170a3b860824&sslmode=require";

		return DriverManager.getConnection(dbUrl, username, password);
	}
}