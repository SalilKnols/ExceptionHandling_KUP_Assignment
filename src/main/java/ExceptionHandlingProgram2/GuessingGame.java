package ExceptionHandlingProgram2;

import java.util.Scanner;

public class GuessingGame {

    public static void numberGuessingGame() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 100) + 1;
        boolean isGuessed = false;

        while (!isGuessed) {
            try {
                System.out.print("Enter a number between 1 and 100: ");
                int guess = Integer.parseInt(scanner.nextLine());

                if (guess < 1 || guess > 100) {
                    System.out.println("Invalid input. Please enter a number between 1 and 100.");
                }
                else if (guess < randomNumber) {
                    System.out.println("Too low.");
                }
                else if (guess > randomNumber) {
                    System.out.println("Too high.");
                }
                else {
                    System.out.println("You guessed it!");
                    isGuessed = true;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public static void main(String[] args) {

        numberGuessingGame();
    }
}
