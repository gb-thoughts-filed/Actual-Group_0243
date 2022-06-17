import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AccountSystem {

    protected List<UserAccount> allUsers;

    public AccountSystem(){
    }

    public UserAccount addToSystem(CreateUserAccount obj){
        if (obj.createUserAccount() == null){
            return null;
        }
        allUsers.add(obj.createUserAccount());
        return obj.createUserAccount();
    }

    public UserAccount logIn(String username, String password){
        for (UserAccount u: allUsers){
            if (u.getUsername().equals(username) && u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }

    public UserAccount createUser(String newUsername, String password, boolean admin){
        CreateUserAccount newUser = new CreateUserAccount(newUsername, password, admin);
        return addToSystem(newUser);
    }

    public boolean checkUsername(String username){
        for (UserAccount user: allUsers) {
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