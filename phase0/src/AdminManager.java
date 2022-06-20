import java.time.LocalDateTime;
import java.util.Map;
public class AdminManager extends AccountSystem{

    private final Map<UserAccount, LocalDateTime> bannedAccounts;

    public AdminManager(Map<UserAccount, LocalDateTime> bannedAccounts){
        this.bannedAccounts = bannedAccounts;
    }

    public void promoteAdminUser(String username) {
        AccountSystem system = new AccountSystem();
        for (UserAccount user: AccountSystem.allUsers) {
            if(user.getUsername().equals(username)) {
                user.admin = true;
            }
        }

    }

    public void temporaryBan(String username, LocalDateTime banLength) {
        for (UserAccount user: AccountSystem.allUsers) {
            if(user.getUsername().equals(username)) {
                AccountSystem.allUsers.remove(user);
                bannedAccounts.put(user, banLength);
            }
        }
    }

    public void unbanAccount(String username, LocalDateTime banLength) {
        for (UserAccount user: bannedAccounts.keySet()) {
            if (user.getUsername().equals(username) && LocalDateTime.now().isAfter(banLength)) {
                AccountSystem.allUsers.add(user);
                bannedAccounts.remove(user);
            }
        }
    }

    public void deleteUser(String username){
        AccountSystem.allUsers.removeIf(user -> user.getUsername().equals(username));
    }

    public void createNewAdmin(String username, String password){
        AccountSystem system = new AccountSystem();
        system.createUser(username, password, true);
    }

}
