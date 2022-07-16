import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
public class UserAccount{
    private static String username;
    private String password;

    protected boolean admin;

    private final List<LocalDateTime> loginTimes = new ArrayList<>();

    public UserAccount(String username, String password, boolean admin) {
        this.username = username;
        this.password = password;
        this.admin = admin;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public static String getUsername() {
        return username;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean getStatus() { return this.admin; }

    public String changePassword(String newPassword) {
        String oldPassword = this.password;
        this.password = newPassword;
        return oldPassword;
    }

    public List<LocalDateTime> loginHistory(LocalDateTime time) {
        loginTimes.add(time);
        return loginTimes;
    }

    public List<LocalDateTime> getLoginHistory() { return loginTimes; }

    public String toString(){
        return "Welcome to your account " + username;
    }
}
