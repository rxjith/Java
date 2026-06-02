import java.util.Arrays;
import java.util.Scanner;                                       // Class: For user input

public class ArrayIO{
    public static void main(String[] args){
        int[][] numbers = new int[2][3];                        // Array declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array elements: ");
    
        for (int i=0; i<2; i++) {
            for (int j=0; j<3; j++) {
                System.out.print("Enter element into row " + (i+1) + ", col " + (j+1) + ": ");
                numbers[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(numbers));       // Output: Entire array
    }
}