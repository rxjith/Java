package labWork;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// Program to print factorial of a given number using a while loop
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter n: ");
			int n = scanner.nextInt();
			
			int f = 1, i = 1;
			
			while (i <= n) {
				f *= i;
				i++;
			} System.out.printf("Factorial of %d: %d\n", n, f);
		}

	}

}
