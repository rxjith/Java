package Tutorial5;
import java.util.Scanner;
import java.util.Vector;

/* Create a Vector<String> with values: "Pen", "Notebook", "Eraser", and "Marker". 
 * Ask the user (using Scanner) to enter an item name. 
 * Check if the item exists in the vector and print "Item found" or "Item not found". */

public class SearchVector {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			Vector<String> items = new Vector<>();
			
			items.add("Pen");
			items.add("Notebook");
			items.add("Eraser");
			items.add("Marker");
			
			System.out.println("Items \"Pen\", \"Notebook\", \"Eraser\", \"Marker\" added into vector!");
			
			System.out.print("Enter item to search for: ");
			String searchKey = scanner.next();
			
			boolean found = false;
			for (String item : items) {
				if (item.equals(searchKey)) {
					found = true;
					break;
				}
			}
			
			if (found) {
				System.out.println("Item found!");
			} else {
				System.out.println("Item not found!");
			}
			
		}
		
	}

}
