import java.util.Arrays;                                                // Class to deal with Arrays
import java.util.Scanner;                                               // Class to deal with user input

public class ArrayIO {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];

        try (Scanner scanner = new Scanner(System.in)) {                // Switched to Try-with-resources method
            System.out.println("Input array elements: ");               // Prompts user to input elements
        
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter element into row " + (i + 1) + ", col " + (j + 1) + ": ");
                    numbers[i][j] = scanner.nextInt();                  // Shoving this input into the jth col of ith row
                }
            }
            System.out.println(Arrays.deepToString(numbers));           // Printing the entire array
        } 
    }
}