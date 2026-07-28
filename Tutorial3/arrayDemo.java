package Tutorial3;
import java.util.Scanner;

public class arrayDemo {

	static int n;
	
	public static void main(String[] args) {
		// Input n numbers and store them in an array. Then display the array elements in the same order and in reverse order.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of elements to read into the array: ");
		n = scanner.nextInt();
		
		int[] arr = new int[n];
		
		readElements(scanner, arr);
		displayElements(arr);
		displayElementsReversed(arr);

		scanner.close();
	}
	
	static void readElements(Scanner scanner, int[] arr) {
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter element %d: ", i + 1);
			arr[i] = scanner.nextInt();
		} System.out.println("Elements entered into array successfully!\n");
	}
	
	static void displayElements(int[] arr) {
		System.out.print("Printing array elements normally: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", arr[i]);
		} System.out.println("\n");
	}
	
	static void displayElementsReversed(int[] arr) {
		System.out.print("Printing array elements in reverse: ");
		int i = n-1;
		while (i != -1) {
			System.out.printf("%d ", arr[i--]);
		} System.out.println("\n");
	}

}
