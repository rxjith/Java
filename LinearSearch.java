import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        
        int[] array; boolean found = false; int position = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of elements in the array: ");
        int size = scanner.nextInt(); 
        scanner.nextLine();

        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.print("Enter the element you wanna search for: ");
        int key = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        for (int number : array) {
            position++;
            if (key == number) {
                found = true;
                break;
            }
        }
        
        if (found)
            System.out.printf("%d was found in position %d\n", key, position);
        else
            System.out.printf("%d was not found in the array!\n", key);
    }
}