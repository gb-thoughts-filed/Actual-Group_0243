import java.util.ArrayList;
import java.util.List;
public class CreateUserAccount extends ValidateCredentials{
    private String newUsername;
    private String newPassword;
    private boolean admin;
    protected static List<UserAccount> allCreatedUsers  = new ArrayList<>();


    public CreateUserAccount(String newUsername, String newPassword, boolean admin) {
        this.newUsername = newUsername;
        this.newPassword = newPassword;
        this.admin = admin;
    }

    /**
     * Checks if the username is not already assigned to another user in the system.
     * @param username the username that needs to be checked
     * @return boolean
     */
    public boolean uniqueUsername(String username){
        for (UserAccount user: allCreatedUsers){
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Assigns new username to the CreateUserAccount object if the username is between 5 and 8 symbols in length,
     * does not contain special characters and is not already assigned to another user. If the username does not meet
     * the requirements, returns false
     * @param username the username that needs to be assigned
     * @return boolean
     */
    public boolean createUsername(String username) {
        if (isValidUsername(username)) {
            this.newUsername = username;
            return true;
        }
        else return false;
    }

    /**
     * Assigns new password to the CreateUserAccount object if the password is between 8 and 12 characters and does not
     * contain any special characters. If the password does not meet the requirements, returns false.
     * @param password the password that needs to be assigned
     * @return boolean
     */
    public boolean createPassword(String password) {
        if (isValidPassword(password)) {
            this.newPassword = password;
            return true;
        }
        else return false;
    }

    /**
     * Returns the password currently assigned to this CreateNewUser object.
     * @return String
     */
    public String getNewPassword() { return this.newPassword; }

    /**
     * Creates and returns a new UserAccount object and adds it to the list of all created users. Before creating the
     * user, also checks the username and password that need to be assigned to the user account. If password and/or
     * username do not meet the requirements, returns null.
     * @return UserAccount object
     */
    public UserAccount createUserAccount() {
        if (createPassword(this.newPassword) && createUsername(this.newUsername)) {
            if (this.admin) {
                AdminAccount admin = new AdminAccount(this.newUsername, this.newPassword);
                allCreatedUsers.add(admin);
                return admin;
            } else {
                UserAccount user = new UserAccount(this.newUsername, this.newPassword, false);
                allCreatedUsers.add(user);
                return user;
            }
        }
        else return null;
    }
}