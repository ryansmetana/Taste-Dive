package controllers;
import play.data.validation.Constraints;

public class NewUserData {

    @Constraints.Required
    private String firstName;

    private String lastName;

    @Constraints.Required
    private String username;

    @Constraints.Required
    private String password;

    public NewUserData() {
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }








}
