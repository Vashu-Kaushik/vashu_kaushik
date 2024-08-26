import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] rps = {"Rock", "Paper", "Scissors"};
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            while (true) {
                System.out.println("Enter move (Rock, Paper, Scissors). To exit the game, type \"exit\": ");
                String userMove = scanner.nextLine();

                if (userMove.equalsIgnoreCase("exit")) {
                    break;
                }

                if (!userMove.equalsIgnoreCase("Rock") && !userMove.equalsIgnoreCase("Paper") && !userMove.equalsIgnoreCase("Scissors")) {
                    System.out.println("Invalid move, please try again.");
                    continue;
                }

                int computerMoveIndex = random.nextInt(3);
                String computerMove = rps[computerMoveIndex];
                System.out.println("Computer move: " + computerMove);

                if (userMove.equalsIgnoreCase(computerMove)) {
                    System.out.println("It's a tie!");
                } else if (userMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors") ||
                           userMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock") ||
                           userMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }
        }
    }
}