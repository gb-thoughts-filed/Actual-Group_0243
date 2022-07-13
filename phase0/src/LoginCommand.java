public class LoginCommand {

    private final AccountSystem system;
    private final ValidateCredentials cred;
    private static int lineNumber; //A count to print different lines
    private boolean running;

    public LoginCommand() {
        lineNumber = 0;
        this.system = new AccountSystem();
        this.cred = new ValidateCredentials();
        this.running = true;
    }

    public String inputCheck(String input) {
        String output = "";
        if (lineNumber == 0) {
            output = "Enter username of length between 5 and 8 inclusive. No special symbols.";
        }
        else if ((lineNumber == 1) || (lineNumber == 2)) { output = checkValid(input, lineNumber); }
        else if (lineNumber == 3) {}
        lineNumber += 1;
        return output;
    }

    public String checkValid(String input, int number) {
        if (number == 1) {
            if (cred.isValidUsername(input) & !system.checkUsername(input)) {return "Enter Password";}
            else {return "Invalid username";}
        }
        else{
            if (cred.isValidPassword(input)) {return "Admin or regular";}
            else {lineNumber = 2; return "Invalid Password";}
        }
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
