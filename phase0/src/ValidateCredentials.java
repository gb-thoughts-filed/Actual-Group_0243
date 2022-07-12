public class ValidateCredentials {

    public ValidateCredentials() {
    }

    public boolean isValidPasswordLength(String password) {
        return password.length() >= 8 && password.length() <= 12;
    }

    public boolean isValidUsernameLength(String username) {
        return username.length() >= 5 && username.length() <= 8;
    }

    public boolean isValidSequenceChar(String sequence) {
        char[] charList = sequence.toCharArray();
        for (char u : charList) {
            if (!Character.isLetter(u)) {
                if (!Character.isDigit(u)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidPassword(String password) {
        return isValidSequenceChar(password) && isValidPasswordLength(password);
    }

    public boolean isValidUsername(String username) {
        CreateUserAccount obj = new CreateUserAccount(username, "None", false);
        return isValidUsernameLength(username) && isValidSequenceChar(username) && obj.uniqueUsername(username);
    }
}
