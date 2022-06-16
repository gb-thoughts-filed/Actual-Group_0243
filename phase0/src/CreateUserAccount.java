import java.util.Map;

public abstract class CreateUserAccount {
    private String newUsername;
    private String newPassword;
    private Map allUsers;

    public CreateUserAccount(String newUsername, String newPassword) {
        this.newUsername = newUsername;
        this.newPassword = newPassword;
    }

    public boolean isValidPassword(String password) {
        if (password.length() >= 8 && password.length() <= 12) {
            return true;
        } else return false;
    }

    public boolean isValidUsername(String username) {
        if (!allUsers.containsKey(username)) {
            return true;
        } else return false;
    }

    public void createUsername(String username) {
        if (isValidUsername(username)) {
            this.newUsername = username;
        }
    }

    public void createPassword(String password) {
        if (isValidPassword(password)) {
            this.newPassword = password;
        }
    }

    public void addToSystem(CreateUserAccount obj) {

    }
}
