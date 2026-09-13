package module2;
import java.util.Scanner;

class RecSumOfDigits {
	public int SumOfDigits(int n) {
		if (n == 0) return 0;
		return (n % 10) + SumOfDigits(n / 10); 
	}
}

public class RecursiveSumOfDigits {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter a number: ");
			int n = scanner.nextInt();
			
			RecSumOfDigits s = new RecSumOfDigits();
			
			System.out.printf("Sum of digits of %d: %d\n", n, s.SumOfDigits(n));
		}

	}

}
