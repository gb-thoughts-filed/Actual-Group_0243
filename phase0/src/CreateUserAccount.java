import java.util.Map;

public abstract class CreateUserAccount extends ValidateCredentials{
    private String newUsername;
    private String newPassword;
    private Map allUsers;

    public CreateUserAccount(String newUsername, String newPassword) {
        this.newUsername = newUsername;
        this.newPassword = newPassword;
    }


    public boolean createUsername(String username) {
        if (isValidUsername(username)) {
            this.newUsername = username;
            return true;
        }
        else return false;
    }

    public boolean createPassword(String password) {
        if (isValidPassword(password)) {
            this.newPassword = password;
            return true;
        }
        else return false;
    }

    public void createUserAccount() {
        if (createPassword(this.newPassword) && createUsername(this.newUsername)) {
            ValidateCredentials tag = null;
            UserAccount user = null;
            user.setUsername(this.newUsername);
            user.setPassword(this.newPassword);
            user.tag = tag.createTag();
        }
    }
}
