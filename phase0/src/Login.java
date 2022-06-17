import java.time.LocalDateTime;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // create scanner object
        System.out.println("Type NEW to create user or RETURN to log in.");
        String user = myObj.nextLine(); //read user input
        if (user.equals("NEW")) {
            System.out.println("Enter username");
            String newUsername = myObj.nextLine();
            ValidateCredentials cred = new ValidateCredentials();
            if (cred.isValidUsername(newUsername)) {
                System.out.println("Enter password");
                String newPassword = myObj.nextLine();
                if (cred.isValidPassword(newPassword)) {
                    System.out.println("Type ADMIN to make administrator account or NO for non-admin account.");
                    String admin = myObj.nextLine();
                    if (admin.equals("NEW")) {
                        AccountSystem system = new AccountSystem();
                        system.createUser(newUsername, newPassword, true);
                        System.out.println(system.createUser(newUsername, newPassword, true).toString());
                    } else {
                        AccountSystem system = new AccountSystem();
                        system.createUser(newUsername, newPassword, false);
                    }
                }
                else System.out.println("Invalid password");
            }
            else System.out.println("Invalid username");
        }
        else {
            System.out.println("Enter username");
            String username = myObj.nextLine();
            AccountSystem system = new AccountSystem();
            if (system.checkUsername(username)) {
                System.out.println("Enter password");
                String password = myObj.nextLine();
                if (system.checkPassword(username, password)) {
                    System.out.println(system.logIn(username, password).loginHistory(LocalDateTime.now()));
                }
                else System.out.println("Password does not match");
            }
            else System.out.println("Username not found");
        }
    }

}
