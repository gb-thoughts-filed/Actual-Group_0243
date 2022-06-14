import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class User extends AccountManager implements Username, Password{
    protected String username;
    protected String password;
    protected int birthYear;
    protected String firstName;
    private List<Object> logins;

    public User(String username, String password, int birthYear, String firstName){
        this.username = username;
        this.password = password;
        this.birthYear = birthYear;
        this.firstName = firstName;
        logins = new ArrayList<>();
    }

    public void addToSystem(String username, String password){
        AccountManager database = null;
        database.allUsers.put(username, password);
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void changePassword(String newPassword) {
        if (isValidPassword(newPassword)){
            this.password = newPassword;
        }
    }

    @Override
    public boolean isValidPassword(String password) {
        return true;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean isValidUsername(String username) {
        return true;
    }
}
