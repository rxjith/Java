package Tutorial5;
import java.util.Vector;

/* Create a Vector<String> with the elements "Red", "Green", "Blue", and "Yellow". 
 * Remove "Green" and print the final contents of the vector. */

public class RemoveElementFromVector {

	public static void main(String[] args) {
		
		Vector<String> colors = new Vector<>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		
		System.out.print("Fruit basket contents: ");
		for (String color : colors) {
			System.out.print(color + " ");
		} System.out.println();
		
		colors.remove(1);
		
		System.out.print("Fruit basket contents (after removing \"Green\"): ");
		for (String color : colors) {
			System.out.print(color + " ");
		} System.out.println();
		
	}

}
