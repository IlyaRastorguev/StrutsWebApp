package struts.functions;

public class LoginDataChecker {

    private String userName;

    private String password;

    private boolean result;
    
    public LoginDataChecker(String userName, String pass) {
        this.userName = userName;
        this.password = pass;
        checkLogin();
    }

    private void checkLogin() {
        if (userName != null && password != null)
        result = true;
    }

    public boolean getResult() {
        return result;
    }

}