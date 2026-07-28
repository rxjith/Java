package Tutorial3;
import java.util.Scanner;

public class binarySearchDemo {

	static int n;
	
	public static void main(String[] args) {
		// Search for a number in the array and print its position if found, or a message if not found.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of elements to read into the array: ");
		n = scanner.nextInt();
		
		int[] arr = new int[n];
		
		readElements(scanner, arr);
		displayElements(arr);
		sort(arr);
		displayElements(arr);
		
		System.out.print("Enter key to search for within the array: ");
		int key = scanner.nextInt();
		
		binarySearch(key, arr);

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
	
	static void binarySearch(int key, int[] arr) {
		int low = 0, high = n - 1, position = -1;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			if (arr[mid] == key) {
				position = mid + 1;
			}
			
			if (arr[mid] > key) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		System.out.println();
		
		if (position != -1) {
			System.out.println(key + " was found at position " + position);
		} else {
			System.out.println(key + " was not found within the array!");
		}
	}
	
	static void displayElements(int[] arr) {
		System.out.print("Array elements: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", arr[i]);
		} System.out.println("\n");
	}

}
