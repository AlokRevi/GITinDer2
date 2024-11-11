package ClassFiles.Oct_29.PasswordManager;

public class PasswordManager {

    private String userId;
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(String userId, String password) {
        if ((this.userId.equals(userId)) && (this.password.equals(password))) {
            System.out.println("You are authorized to enter");
        } else
            System.out.println("Access denied.");
    }
}
