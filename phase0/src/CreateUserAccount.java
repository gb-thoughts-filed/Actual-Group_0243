import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class CreateUserAccount extends ValidateCredentials{
    private String newUsername;
    private String newPassword;

    protected boolean admin;

    protected List<UserAccount> allCreatedUsers;


    public CreateUserAccount(String newUsername, String newPassword, boolean admin) {
        this.newUsername = newUsername;
        this.newPassword = newPassword;
        this.admin = admin;
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

    public UserAccount createUserAccount() {
        if (createPassword(this.newPassword) && createUsername(this.newUsername)) {
            ValidateCredentials tag = new ValidateCredentials();
            UserAccount user = new UserAccount("None", "None", false, 0);
            user.setUsername(this.newUsername);
            user.setPassword(this.newPassword);
            user.admin = this.admin;
            user.tag = tag.createTag();
            allCreatedUsers.add(user);
            return user;
        }
        else return null;
    }
}
