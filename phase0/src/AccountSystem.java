import java.util.ArrayList;
import java.util.List;

public class AccountSystem {

    protected List<UserAccount> allUsers;

    public AccountSystem(){
    }

    public boolean addToSystem(CreateUserAccount obj){
        if (obj.createUserAccount() == null){
            return false;
        }
        allUsers.add(obj.createUserAccount());
        return true;
    }

    public boolean logIn(String username, String password){
        for (UserAccount u: allUsers){
            if (u.getUsername().equals(username) && u.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

}
