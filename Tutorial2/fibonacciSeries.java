package Tutorial2;
import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// Input n and print the first n fibonacci numbers using a for loop.
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int n = scanner.nextInt();
			
			int a = 0, b = 1, temp = 0;
			for (int i = 1; i <= n; i++) {
				System.out.print(a + " ");
				temp = a+b;
				a = b;
				b = temp;
			}
		}

	}

}
