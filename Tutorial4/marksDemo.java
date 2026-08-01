package Tutorial4;
import java.util.Scanner;

/* Create a class "Marks" with:
 * variables: mark1, mark2, mark3
 * constructor to initialize all marks
 * method to calculate and return total and average 
*/

class Marks {
	float mark1, mark2, mark3;
	
	Marks() {
		mark1 = mark2 = mark3 = 0.0f;
	}
	
	Marks(float mark1, float mark2, float mark3) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	float total() {
		return mark1 + mark2 + mark3;
	}
	
	float average() {
		return (mark1 + mark2 + mark3)/3.0f;
	}
}

public class marksDemo {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter mark 1: ");
			float mark1 = scanner.nextFloat();
			
			System.out.print("Enter mark 2: ");
			float mark2 = scanner.nextFloat();
			
			System.out.print("Enter mark 3: ");
			float mark3 = scanner.nextFloat();
			
			Marks mark = new Marks(mark1, mark2, mark3);
			float total = mark.total();
			float average = mark.average();
			
			System.out.println("Total Marks: " + total + "\nAverage Marks: " + average);
			
		}

	}

}
