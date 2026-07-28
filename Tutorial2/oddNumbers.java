package Tutorial2;
import java.util.Scanner;

public class oddNumbers {

	public static void main(String[] args) {
		// Odd numbers from 1 - n using a for loop and continue
		
		try (Scanner scanner = new Scanner(System.in)) {
		
			System.out.print("Enter n: ");
			int n = scanner.nextInt();
			
			System.out.println("Odd Numbers from 1 to n:");
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					continue;
				}
				System.out.print(i + " ");
			}
		}

	}

}
