package Tutorial3;
import java.util.Scanner;

public class maximalElementOfArray {
	
	static int n;
	
	public static void main(String[] args) {
		// Input n numbers into an array and find the maximum and minimum values in the array.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of elements to read into the array: ");
		n = scanner.nextInt();
		
		int[] arr = new int[n];
		
		readElements(scanner, arr);
		displayElements(arr);
		
		int minimum = minimalElementFinder(arr);
		int maximum = maximalElementFinder(arr);
		
		System.out.println("Minimal Element: " + minimum);
		System.out.println("Maximal Element: " + maximum);

		scanner.close();
	}
	
	static void readElements(Scanner scanner, int[] arr) {
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter element %d: ", i + 1);
			arr[i] = scanner.nextInt();
		} System.out.println("\nElements entered into array successfully!\n");
	}

	static int minimalElementFinder(int[] arr) {
		int minimum = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] < minimum) {
				minimum = arr[i];
			}
		}
		return minimum;
	}
	
	static int maximalElementFinder(int[] arr) {
		int maximum = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > maximum) {
				maximum = arr[i];
			}
		}
		return maximum;
	}
	
	static void displayElements(int[] arr) {
		System.out.print("Array elements: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", arr[i]);
		} System.out.println("\n");
	}
	
}
