package Tutorial5;
import java.util.Scanner;
import java.util.Vector;

/* Create a Vector<string> to store the names of 5 fruits. Add the elements, 
 * and print each fruit on a new line using an enhanced for loop. */

public class AddAndDisplayStringElements {

	public static void main(String[] args) {
		 
		try (Scanner scanner = new Scanner(System.in)) {
			
			Vector<String> fruits = new Vector<>();
			
			System.out.println("Enter fruits:");
			for (int i = 0; i < 5; i++) {
				System.out.print("Enter fruit " + (i + 1) + ": ");
				fruits.add(scanner.next());
			}
			
			int i = 0;
			for (String fruit : fruits) {
				i++;
				System.out.println("Fruit " + i + ": " + fruit);
			}
			
		}
		
	}

}
