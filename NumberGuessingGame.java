import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfTries = 0;
            int guess;
            boolean win = false;

            while (!win) {
                System.out.println("Guess a number between 1 and 100: ");
                guess = scanner.nextInt();
                numberOfTries++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Invalid guess. Please try again.");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    win = true;
                    System.out.println("Correct! You win! It took you " + numberOfTries + " tries.");
                }
            }
        }
    }
}