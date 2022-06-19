import java.time.LocalDateTime;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // create scanner object
        ValidateCredentials cred = new ValidateCredentials();
        AccountSystem system = new AccountSystem();
        while (true) {
            System.out.println("Type NEW to create user or RETURN to log in.");
            String user = myObj.nextLine(); //read user input
            if (user.equals("NEW")) {
                System.out.println("Enter username of length between 5 and 8 inclusive. No special symbols.");
                String newUsername = myObj.nextLine();
                if (cred.isValidUsername(newUsername)) {
                    System.out.println("Enter password of length between 8 and 12 inclusive. Non special symbols.");
                    String newPassword = myObj.nextLine();
                    if (cred.isValidPassword(newPassword)) {
                        System.out.println("Type ADMIN to make administrator account or NO for non-admin account.");
                        String admin = myObj.nextLine();
                        if (admin.equals("ADMIN")) {
                            system.createUser(newUsername, newPassword, true);
                            UserAccount users = system.createUser(newUsername, newPassword, true);
                            System.out.println(users.toString());
                            //break;
                        } else {
                            system.createUser(newUsername, newPassword, false);
                            UserAccount users = system.createUser(newUsername, newPassword, false);
                            System.out.println(users.toString());
                        }
                    } else System.out.println("Invalid password");
                } else System.out.println("Invalid username. Letters and numbers only. No symbols.");
            } else {
                System.out.println("Enter username");
                String username = myObj.nextLine();
                if (system.checkUsername(username)) {
                    System.out.println("Enter password");
                    String password = myObj.nextLine();
                    if (system.checkPassword(username, password)) {
                        System.out.println(system.logIn(username, password).loginHistory(LocalDateTime.now()));
                    } else System.out.println("Password does not match");
                } else System.out.println("Username not found");
            }
        }

    }
}
