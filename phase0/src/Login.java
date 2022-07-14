import java.time.LocalDateTime;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        LoginCommand command = new LoginCommand();
        Scanner myObj = new Scanner(System.in);
        System.out.println("-----Welcome-----");
        System.out.println("If you are new, please type NEW. If you are logging in, enter your username. " +
                "Otherwise, please type EXIT to leave.");

        while (command.isRunning()) {
            String userInput = myObj.nextLine();
            System.out.println(command.inputCheck(userInput));
        }
        System.out.println("Exited");
    }
}