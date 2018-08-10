package struts.model;

import java.util.Base64;
import java.util.UUID;

/**
 * Model of user
 */
public class User {

    private static final String UID = UUID.randomUUID().toString();

    private String userName;

    private String password;

    private String userUniqueId;

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

    public String getUserUniqueId() {
        return userUniqueId;
    }

    public void setUserUniqueId() {
        byte[] idInBytes = String.format("%s_%s", userName, password).getBytes();
        this.userUniqueId = Base64.getEncoder().encodeToString(idInBytes);
    }
}
