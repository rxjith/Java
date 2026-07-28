package labWork;
import java.util.Scanner;

public class leapYearChecker {
	
	public static void main(String[] args) {
		// Leap year checker
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter a year: ");
			int year = scanner.nextInt();
			
			boolean isLeap = false;
			
			if ((year % 4 == 0 && year % 100 != 0) || year % 4 == 0) {
				isLeap = true;
			}
			
			if (isLeap) {
				System.out.println(year + " is a LEAP year.");
			} else {
				System.out.println(year + " is NOT a LEAP year.");
			}
		}
	}
}
