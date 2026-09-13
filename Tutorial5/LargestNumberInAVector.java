package Tutorial5;
import java.util.Vector;

/* Using a Vector<Integer> with values 25, 60, 15, 80, and 45, 
 * write a Java snippet to find and print the maximum value in the vector. */

public class LargestNumberInAVector {

	public static void main(String[] args) {
		
		Vector<Integer> numbers = new Vector<>();
		
		numbers.add(25);
		numbers.add(60);
		numbers.add(15);
		numbers.add(80);
		numbers.add(45);
		
		System.out.println("Numbers 25, 60, 15, 80, 45 added into vector!");
		
		int largest = numbers.get(0);
		
		for (int number : numbers) {
			if (number > largest) {
				largest = number;
			}
		}
		
		System.out.println("Largest number in the vector: " + largest);
		
	}

}
