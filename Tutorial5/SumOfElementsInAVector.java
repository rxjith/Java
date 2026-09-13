package Tutorial5;
import java.util.Vector;

/* Create a Vector<Integer> and add the numbers 10, 20, 30, 40, and 50. 
 * Then, calculate and print the sum of all the elements in the vector. */

public class SumOfElementsInAVector {

	public static void main(String[] args) {
		
		Vector<Integer> numbers = new Vector<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		System.out.println("Numbers 10, 20, 30, 40, 50 added into vector!");
		
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		} System.out.println("Sum of all elements in the vector: " + sum);
		
	}

}
