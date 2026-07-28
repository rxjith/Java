package Tutorial3;
import java.util.Scanner;

public class countEvenOdd {

	static int n;
	
	public static void main(String[] args) {
		// Count the number of even and odd elements in the array of n integers entered by the user.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of elements to read into the array: ");
		n = scanner.nextInt();
		
		int[] arr = new int[n];
		
		readElements(scanner, arr);
		displayElements(arr);
		displayCount(arr);

		scanner.close();
	}
	
	static void readElements(Scanner scanner, int[] arr) {
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter element %d: ", i + 1);
			arr[i] = scanner.nextInt();
		} System.out.println("Elements entered into array successfully!\n");
	}
	
	static void displayElements(int[] arr) {
		System.out.print("Array elements: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", arr[i]);
		} System.out.println("\n");
	}
	
	static void displayCount(int[] arr) {
		int oddCount = 0, evenCount = 0;
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				continue;
			}
			else if (arr[i] % 2 == 0) {
				evenCount++;
			} else oddCount++;
		}
		
		System.out.printf("Number of even numbers in the array: %d\n", evenCount);
		System.out.printf("Number of odd numbers in the array: %d\n", oddCount);
	}

}
