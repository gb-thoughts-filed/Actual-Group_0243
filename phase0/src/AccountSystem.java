import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AccountSystem {

    protected List<UserAccount> allUsers;

    public AccountSystem() {
        allUsers = new ArrayList<>();
    }

    public UserAccount addToSystem(CreateUserAccount obj) {
        UserAccount user = obj.createUserAccount();
        if (user == null) {
            return null;
        }
        allUsers.add(user);
        return user;
    }

    public UserAccount logIn(String username, String password) {
        for (UserAccount u : allUsers) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    public UserAccount createUser(String newUsername, String password, boolean admin) {
        CreateUserAccount newUser = new CreateUserAccount(newUsername, password, admin);
        newUser.createUserAccount();
        return addToSystem(newUser);
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
