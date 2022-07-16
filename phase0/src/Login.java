
import java.time.LocalDateTime;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        LoginCommand command = new LoginCommand();
        Scanner myObj = new Scanner(System.in);
        int line = 0;
        System.out.println("-----Welcome-----");

        while (command.isRunning()) {
            if (line == 0) {
                System.out.println("OLD or NEW");
            }
            else if (line == 1) {
                System.out.println("Enter username of length between 5 and 8 inclusive. No special symbols.");
            }
            else if ((line == 2)) {
                System.out.println("Enter password of length between 8 and 12 inclusive. No special symbols.");
            }
            else if (line == 3) {
                System.out.println("ADMIN or NO");
            }
            else if (line == 4) {
                System.out.println("Enter username");
            }
            else if (line == 5) {
                System.out.println("Enter password");
            }
            else if (line == 8) {
                System.out.println("Invalid Username or Password");
            }
            if (line != 8) {
                String userInput = myObj.nextLine();
                line = command.inputCheck(userInput);
            } else {line = 0;}
        }
        System.out.println("Exited");
    }
}