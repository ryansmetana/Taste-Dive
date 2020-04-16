package controllers;

import play.data.validation.Constraints;

public class PasswordData {

    @Constraints.Required
    private String currentPassword;

    @Constraints.Required
    private String newPassword;

    @Constraints.Required
    private String newPasswordCheck;

    public PasswordData() {
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public String getNewPassword(){
        return newPassword;
    }

    public String getNewPasswordCheck(){
        return newPasswordCheck;
    }

    public void setCurrentPassword(String currentPassword){
        this.currentPassword = currentPassword;
    }

    public void setNewPassword(String newPassword){
        this.newPassword = newPassword;
    }

    public void setNewPasswordCheck(String newPasswordCheck){
        this.newPasswordCheck = newPasswordCheck;
    }
}
