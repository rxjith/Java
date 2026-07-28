package Tutorial2;
import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		// Input a four-digit number and calculate the sum of its digits using a while loop.
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter a number: ");
			int n = scanner.nextInt();
			
			int copy = n, sum = 0;
			
			while (n != 0) {
				sum += (n % 10);
				n /= 10;
			}
			
			System.out.printf("Sum of digits of %d: %d\n", copy, sum);
		}
	}

}
