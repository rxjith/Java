package Tutorial3;
import java.util.Scanner;

public class sortArray {

	static int n;
	
	public static void main(String[] args) {
		// Sort the array elements in ascending order and display the sorted array.

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of elements to read into the array: ");
		n = scanner.nextInt();
		
		int[] arr = new int[n];
		
		readElements(scanner, arr);
		displayElements(arr);
		sort(arr);
		displayElements(arr);

		scanner.close();
	}
	
	static void readElements(Scanner scanner, int[] arr) {
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter element %d: ", i + 1);
			arr[i] = scanner.nextInt();
		} System.out.println("\nElements entered into array successfully!\n");
	}

	static void sort(int[] arr) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		} System.out.println("Array sorted successfully!\n");
	}
	
	static void displayElements(int[] arr) {
		System.out.print("Array elements: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", arr[i]);
		} System.out.println("\n");
	}

}
