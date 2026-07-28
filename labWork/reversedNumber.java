package labWork;
import java.util.Scanner;

public class reversedNumber {

	public static void main(String[] args) {
		// Reversing a number using a for loop
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter a number to reverse: ");
			int num = scanner.nextInt();
			
			System.out.printf("Reverse of %d: ", num);
			for (int i = num; i != 0; i /= 10) {
				System.out.printf("%d", i%10);
			}
		}

	}

}