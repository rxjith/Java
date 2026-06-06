import java.util.Random;
import java.util.Scanner;

public class numberGuesser {
    static int min = 1, max = 100, attempt = 1;                             // Iniitialziing constants
    public static void main(String[] args) {
        Random random = new Random();                                       // Calling the random method
        int randomNumber = random.nextInt(min, max+1);                      // Initializing the random variable with a pseudo-random number
        boolean guessed = false;                                            // loop control flag
        
        System.out.println("Welcome to my Number Guessing Game:");              
        System.out.printf("Guess a number between %d-%d\n", min, max);
        
        try (Scanner input = new Scanner(System.in)) {                      // Scanner for user input
            do {                                                            
                System.out.print("Enter a guess: ");    
                int number = input.nextInt();                               // User enters their guess/(es)

                if (number > randomNumber) {                    
                    System.out.println("TOO HIGH! Try again.");             
                    attempt++;                                              // Increment number of attempts
                } else if (number < randomNumber) {
                    System.out.println("TOO LOW! Try again.");
                    attempt++;                                              // Increment number of attempts
                } else {
                    System.out.printf("BINGO! You guessed it on try #%d\n", attempt);
                    guessed = true;                                         // flag changed to true to exit loop
                }
            } while (!guessed);
        }
    }
}