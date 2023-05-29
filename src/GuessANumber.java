import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(100);

        while (true) {
            System.out.print("Now is your chance to guess the number (1-100): ");
            String playerInput = scanner.next();

            int playerNumber;
            boolean isValid = true;

            for (int moves = 0; moves < playerInput.length() - 1; moves++) {
                if (playerInput.charAt(moves) < 48 || playerInput.charAt(moves) > 57) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                playerNumber = Integer.parseInt(playerInput);
                if (playerNumber == computerNumber) {
                    System.out.println("Congratulations, you guess the number!");
                    break;
                } else if (playerNumber > computerNumber) {
                    System.out.println("Your number is too high, try again!");
                } else {
                    System.out.println("Your number is too low, try again!");
                }

            } else {
                System.out.println("Sorry your input is invalid, try again!");
            }
        }
    }
}
