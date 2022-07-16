import java.time.LocalDateTime;
public class LoginCommand {

    private final AccountSystem system; //Account System
    private final ValidateCredentials cred;
    private static int lineNumber; //A count to print different lines
    private boolean running;
    private String newUsername;
    private String newPassword;
    private boolean admin;
    private String username;
    private String password;

    public LoginCommand() {
        lineNumber = 0;
        this.system = new AccountSystem();
        this.cred = new ValidateCredentials();
        this.running = true;
        this.newUsername = null;
        this.newPassword = null;
        this.admin = false;
        this.username = null;
        this.password = null;

    }

    public String inputCheck(String input) {
        String output = "";
        if (input.equals("EXIT")) { running = false; return "Exiting";}
        else if ((!input.equals("NEW")) & lineNumber == 0) {
            lineNumber = 4;
        }
        if (lineNumber == -1) {
            output = "Enter username";
        }
        else if (lineNumber == 0) {
            output = "Enter username of length between 5 and 8 inclusive. No special symbols.";
        }
        else if ((lineNumber == 1) || (lineNumber == 2)) {
            System.out.println("1");
            output = checkValid(input, lineNumber);
        }
        else if (lineNumber == 3) {
            adminCheck(input);
            System.out.println("User " + newUsername + " created");
            output = "Enter username";
        }
        else if (lineNumber == 4) {
            username = input;
            output = "Enter password";
        }
        else if (lineNumber == 5) {
            password = input;
            login(username, password);
            output = username + "'s login times: " + system.logIn(username, password).loginHistory(LocalDateTime.now());
            lineNumber = -2;
        }
        lineNumber += 1;
        return output;
    }

    public String login(String username, String password) {
        return String.valueOf(system.logIn(username, password));
    }
    public String checkValid(String input, int number) {
        System.out.println("here");
        if (number == 1) {
            if (cred.isValidUsername(input) & !system.checkUsername(input)) {
                newUsername = input;
                return "Enter Password";
            }
            else {lineNumber = 1; return "Invalid username";}
        }
        else{
            if (cred.isValidPassword(input)) {
                newPassword = input;
                return "Enter ADMIN or NONE";
            }
            else {lineNumber = 2; return "Invalid Password";}
        }
    }

    public void adminCheck(String input) {
        if (input.equals("ADMIN")) {
            admin = true;
        }
        system.createUser(newUsername, newPassword, admin);
    }
    public boolean isRunning() {
        return running;
    }

    public void stopRunning() {
        running = false;
    }

    public AccountSystem getAccountSystem() {
        return system;
    }

    public ValidateCredentials getValidateCredentials() {
        return cred;
    }
}
