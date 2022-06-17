import java.time.LocalDateTime;
import java.util.Map;
public class AdminManager extends AccountSystem{

    private Map<UserAccount, LocalDateTime> bannedAccounts;

    public AdminManager(){}

    public void promoteAdminUser(String username) {
        AccountSystem system = new AccountSystem();
        for (UserAccount user: system.allUsers) {
            if(user.getUsername().equals(username)) {
                user.admin = true;
            }
        }

    }

    public void temporaryBan(String username, LocalDateTime banLength) {
        AccountSystem system = new AccountSystem();
        for (UserAccount user: system.allUsers) {
            if(user.getUsername().equals(username)) {
                system.allUsers.remove(user);
                bannedAccounts.put(user, banLength);
            }
        }
    }

    public void unbanAccount(String username, LocalDateTime banLength) {
        AccountSystem system = new AccountSystem();
        for (UserAccount user: bannedAccounts.keySet()) {
            if (user.getUsername().equals(username) && LocalDateTime.now().isAfter(banLength)) {
                system.allUsers.add(user);
                bannedAccounts.remove(user);
            }
        }
    }

    public void deleteUser(String username){
        AccountSystem system = new AccountSystem();
        for (UserAccount user: system.allUsers) {
            if(user.getUsername().equals(username)) {
                system.allUsers.remove(user);
            }
        }
    }

    public void createNewAdmin(String username, String password){
        CreateUserAccount obj = new CreateUserAccount(username, password, true);
        obj.createUserAccount();
    }

}
