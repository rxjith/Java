package labWork;
import java.util.Scanner;

public class primeChecker {

	public static void main(String[] args) {
		// Checking if a number is prime with if-else and for constructs
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter number: ");
			int n = scanner.nextInt();
			
			boolean isPrime = true;
			
			if (n < 2) {
				System.out.printf("%d is not a prime number!\n", n);
				return;
			}
			
			for (int i = 2; i*i <= n; i++) {
				if (n % i == 0) { 
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				System.out.println(n + " is a prime number!\n");
			} else {
				System.out.println(n + " is NOT a prime number!\n");
			}
		}

	}

}
