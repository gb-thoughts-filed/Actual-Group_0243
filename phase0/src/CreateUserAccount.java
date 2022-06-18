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
        this.allCreatedUsers = new ArrayList<>();
    }

    public boolean uniqueUsername(String username){
        for (UserAccount user: allCreatedUsers){
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public boolean createUsername(String username) {
        if (isValidUsername(username) && uniqueUsername(username)) {
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
            UserAccount user = new UserAccount(this.newUsername, this.newPassword, this.admin);
            allCreatedUsers.add(user);
            return user;
        }
        else return null;
    }
}