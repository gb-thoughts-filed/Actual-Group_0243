import java.util.Random;

public class ValidateCredentials {
    private String username;
    private String password;

    public ValidateCredentials() {
    }

    public boolean isValidPasswordLength(String password) {
        if (password.length() >= 8 && password.length() <= 12) {
            return true;
        } else return false;
    }

    public boolean isValidUsernameLength(String username) {
        if (password.length() >= 5 && password.length() <= 8) {
            return true;
        } else return false;
    }

    public boolean isValidPasswordChar(String password) {
        char[] passList = password.toCharArray();
        for (char p: passList) {
            if (!Character.isLetter(p) || !Character.isDigit(p)) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidUsernameChar(String username) {
        char[] userList = username.toCharArray();
        for (char u : userList) {
            if (!Character.isLetter(u) || !Character.isDigit(u)) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidPassword(String password) {
        return isValidPasswordChar(password) && isValidPasswordLength(password);
    }

    public boolean isValidUsername(String username) {
        return isValidUsernameLength(username) && isValidUsernameChar(username);
    }
    public int createTag(){
        Random rand = new Random();
        return rand.ints(4).hashCode();
    }
}
