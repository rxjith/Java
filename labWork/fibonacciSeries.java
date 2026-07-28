package labWork;
import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// display prime numbers using a while loop
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter n: ");
			int n = scanner.nextInt();
			
			int a = 0, b = 1;
			System.out.print("Fibonacci Series: ");
			
			while (a <= n) {
				System.out.print(a + " ");
				int f = a + b;
				a = b;
				b = f;
			}
		}

	}

}
