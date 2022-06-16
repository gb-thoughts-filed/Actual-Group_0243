import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
public class UserAccount extends ValidateCredentials{
    private String username;
    private String password;

    protected int tag;

    protected boolean admin;

    private List<LocalDateTime> loginTimes;

    public UserAccount(String username, String password, boolean admin, int tag) {
        this.username = username;
        this.password = password;
        this.admin = admin;
        this.tag = tag;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public List<LocalDateTime> loginHistory(LocalDateTime time){
        loginTimes.add(time);
        return loginTimes;
    }

    public String toString(){
        return "Welcome " + username +" to you account!";
    }
}
