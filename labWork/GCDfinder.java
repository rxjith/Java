package labWork;
import java.util.Scanner;

public class GCDfinder {

	public static void main(String[] args) {
		// GCD finder
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter 1st number: ");
			int a = scanner.nextInt();
			System.out.print("Enter 2nd number: ");
			int b = scanner.nextInt();
			
			int largest = (a > b) ? a : b;
			int smallest = (a < b) ? a : b;
			
			while (smallest != 0) {
				int remainder = largest % smallest;
				largest = smallest;
				smallest = remainder;
			}
			
			System.out.printf("GCD(%d, %d): %d\n", a, b, largest);
			
		}

	}

}
