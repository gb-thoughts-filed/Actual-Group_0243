import java.util.ArrayList;
import java.util.List;

public class AccountSystem {

    protected List<UserAccount> allUsers = new ArrayList<>();

    public AccountSystem() {
    }

    public UserAccount logIn(String username, String password) {
        for (UserAccount u : allUsers) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    public void createUser(String newUsername, String password, boolean admin) {
        CreateUserAccount newUser = new CreateUserAccount(newUsername, password, admin);
        UserAccount user = newUser.createUserAccount();
        if (user == null) {
            return;
        }
        allUsers.add(user);
    }

    public boolean checkUsername(String username) {
        for (UserAccount user : allUsers) {
                if (user.getUsername().equals(username)) {
                    return true;
                }
            }
        return false;
    }


    public boolean checkPassword(String username, String password) {
        for (UserAccount user: allUsers) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
