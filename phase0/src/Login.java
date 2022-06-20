import java.time.LocalDateTime;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // create scanner object
        ValidateCredentials cred = new ValidateCredentials();
        AccountSystem system = new AccountSystem();
        System.out.println("------ Welcome ------");
        System.out.println("If you are new, please type NEW. If you are logging in, enter your username. Otherwise, please type EXIT to leave.");
        while (true) {
            String user = myObj.nextLine(); //read user input
            if (user.equals("NEW")) {
                System.out.println("Enter username of length between 5 and 8 inclusive. No special symbols.");
                String newUsername = myObj.nextLine();
                if (system.checkUsername(newUsername)) {
                    System.out.println("Please try a new username. Username taken.");
                    continue;
                }
                if (cred.isValidUsername(newUsername)) {
                    System.out.println("Enter password of length between 8 and 12 inclusive. Non special symbols.");
                    String newPassword = myObj.nextLine();
                    if (cred.isValidPassword(newPassword)) {
                        System.out.println("Type ADMIN to make administrator account or NO for non-admin account.");
                        String admin = myObj.nextLine();
                        system.createUser(newUsername, newPassword, admin.equals("ADMIN"));
                        System.out.println("Account '" + newUsername + "' created");
                    } else System.out.println("Invalid password");
                } else System.out.println("Invalid username. Letters and numbers only. No symbols.");
            } else if (user.equals("EXIT")) {
                break;
            } else {
                if (system.checkUsername(user)) {
                    System.out.println("Enter password");
                    String password = myObj.nextLine();
                    if (system.checkPassword(user, password)) {
                        System.out.println(system.logIn(user, password).toString());
                        System.out.println(user + "'s login times: " + system.logIn(user, password).loginHistory(LocalDateTime.now()));
                    } else System.out.println("Password does not match");
                } else System.out.println("Username not found");
            }
        }
    }
}
