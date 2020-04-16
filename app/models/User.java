package models;

public class User{
    public String username;
    public String password;
    public String firstName;
    public String lastName;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
