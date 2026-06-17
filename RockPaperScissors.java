import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        int wins = 0;
        int losses = 0;
        int ties = 0;

        char playAgain = 'y';

        System.out.println("=== Rock Paper Scissors ===");

        do {
            System.out.print("\nEnter your choice (1-Rock, 2-Paper, 3-Scissors): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Enter a number.");
                scanner.next();
                continue;
            }

            int userChoice = scanner.nextInt();

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Choose 1, 2, or 3.");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;

            System.out.println("You chose: " + choices[userChoice - 1]);
            System.out.println("Computer chose: " + choices[computerChoice - 1]);

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
                ties++;
            } else if ((userChoice == 1 && computerChoice == 3) ||
                       (userChoice == 2 && computerChoice == 1) ||
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
                wins++;
            } else {
                System.out.println("Computer wins!");
                losses++;
            }

            System.out.print("Play again? (y/n): ");
            playAgain = scanner.next().toLowerCase().charAt(0);

        } while (playAgain == 'y');

        System.out.println("\n=== Final Results ===");
        System.out.println("Wins   : " + wins);
        System.out.println("Losses : " + losses);
        System.out.println("Ties   : " + ties);

        scanner.close();
    }
}