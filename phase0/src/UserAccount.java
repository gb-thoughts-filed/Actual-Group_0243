import java.util.ArrayList;
import java.util.List;
public class UserAccount{
    private String username;
    private String password;

    private boolean admin;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
        admin = false;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String name) {
        this.password = name;
    }

    public String getPassword() {
        return this.password;
    }

    public String changePassword(String newPassword) {
        String oldPassword = this.password;
        this.password = newPassword;
        return oldPassword;
    }

    public List<Object> loginHistory(){
        return new ArrayList<>();
    }
}
