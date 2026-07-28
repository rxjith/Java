package labWork;
import java.util.Scanner;

public class primeNumbersExtended {

    public static void main(String[] args) {
        // Prime Numbers between 1 - 100 using for and if-else constructs
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Prime Numbers from 1 - 100:\n");
            int n = 100;
            
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;

                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) { 
                        isPrime = false;
                        break;
                    }
                }
                
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}