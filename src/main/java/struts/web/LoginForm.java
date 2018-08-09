package struts.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm {

    private static final Long SerialVersionUID = 2L;

    private static final String PASSWORD_REGEXP = "([a-zA-Z]{8,})([0-9]{2,})";

    private String userName;

    private String password;

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors actionErrors = new ActionErrors();
        if (userName == null || userName.length() < 2) {
            actionErrors.add("userName", new ActionMessage("User name is required"));
        }
        if (password == null) {
            actionErrors.add("password", new ActionMessage("Password is required"));
        }
        if (password.matches(PASSWORD_REGEXP)) {
            actionErrors.add("password", new ActionMessage("Password must be 8 chars or longer and contains minimum two nubders"));
        }
        return actionErrors;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
