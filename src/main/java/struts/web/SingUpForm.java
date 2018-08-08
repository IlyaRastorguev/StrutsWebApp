package struts.web;

import org.apache.struts.action.ActionForm;

public class SingUpForm extends ActionForm {

    private String userName;

    private String passwordMain;

    private String passwordSecond;

    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswordMain() {
        return passwordMain;
    }

    public void setPasswordMain(String passwordMain) {
        this.passwordMain = passwordMain;
    }

    public String getPasswordSecond() {
        return passwordSecond;
    }

    public void setPasswordSecond(String passwordSecond) {
        this.passwordSecond = passwordSecond;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
