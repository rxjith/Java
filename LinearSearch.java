import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        
        int[] array;                                                                // Instantiate array
        Scanner scanner = new Scanner(System.in);                                   // Instantiate scanner
        
        System.out.print("Enter number of elements in the array: ");                // Prompt user for size of array
        int size = scanner.nextInt();                                               // User enters size
        scanner.nextLine();                                                         // Clear buffer

        array = new int[size];                                                      // Define array with size

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element %d: ", i + 1);                         // Prompt user for each element
            array[i] = scanner.nextInt();                                           // Enter each element
            scanner.nextLine();                                                     // Clear buffer
        }

        System.out.print("Enter the element you wanna search for: ");               // Prompt user for key
        int key = scanner.nextInt();                                                // User enters key
        scanner.nextLine();                                                         // Clear buffer
        scanner.close();                                                            // Close scanner
        
        LinearSearchAlgo(key, array);                                               // Call Linear Search Method
    }

    static void LinearSearchAlgo(int key, int[] array) {
        boolean found = false;
        int position = 1;                                                           // Local variables initialization

        for (int number : array) {
            if (key == number) {
                found = true;                                                       // Linear Search Implementation
                break;
            } position++;
        }
        
        if (found)
            System.out.printf("%d was found at positon %d!\n", key, position);      // Display appropriate message
        else
            System.out.printf("%d was not found within the array.\n", key);
    }
}