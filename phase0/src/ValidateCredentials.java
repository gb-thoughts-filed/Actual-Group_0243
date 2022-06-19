public class ValidateCredentials {

    public ValidateCredentials() {
    }

    public boolean isValidPasswordLength(String password) {
        return password.length() >= 8 && password.length() <= 12;
    }

    public boolean isValidUsernameLength(String username) {
        return username.length() >= 5 && username.length() <= 8;
    }

    public boolean isValidPasswordChar(String password) {
        char[] passList = password.toCharArray();
        for (char p: passList) {
            if (!Character.isLetter(p)) {
                if (!Character.isDigit(p)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidUsernameChar(String username) {
        char[] userList = username.toCharArray();
        for (char u : userList) {
            if (!Character.isLetter(u)) {
                if (!Character.isDigit(u)) {
                    return false;
                }
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
}
