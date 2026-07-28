package Tutorial2;
import java.util.Scanner;

public class palindromeChecker {

	public static void main(String[] args) {
		// Input an integer and check if it's a palindrome (reads same forward and backward) using a while loop.
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter a number: ");
			int n = scanner.nextInt();
			
			int copy = n;
			
			int reversed = 0;
			while (n != 0) {
				reversed = (reversed * 10) + (n % 10);
				n /= 10;
			}
			n = copy;
			
			if (n == reversed) {
				System.out.println(n + " is a Palindrome!");
			} else {
				System.out.println(n + " is NOT a Palindrome!");
			}
		}
	}

}
