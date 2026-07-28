package Tutorial3;

import java.util.Scanner;

public class sumAndAverage {

	static int n;
	
	public static void main(String[] args) {
		// Input n numbers and calculate the sum and average of the elements in the array.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of elements to read into the array: ");
		n = scanner.nextInt();
		
		int[] arr = new int[n];
		
		readElements(scanner, arr);
		displayElements(arr);
		
		int sum = sum(arr);
		float average = average(sum, arr);
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);

		scanner.close();
	}
	
	static void readElements(Scanner scanner, int[] arr) {
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter element %d: ", i + 1);
			arr[i] = scanner.nextInt();
		} System.out.println("\nElements entered into array successfully!\n");
	}

	static int sum(int[] arr) {
		int sum = arr[0];
		for (int i = 1; i < n; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	static float average(int sum, int[] arr) {
		return sum / (float) n;
	}
	
	static void displayElements(int[] arr) {
		System.out.print("Array elements: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", arr[i]);
		} System.out.println("\n");
	}

}
