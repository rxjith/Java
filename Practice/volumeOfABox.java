package Practice;
import java.util.Scanner;

class Box {
	double height, width, depth;
	
	static double volume (double height, double width, double depth) {
		return height * width * depth;
	}
}

public class volumeOfABox {

	public static void main(String[] args) {
		// Compute the volume of a box with height, width, and depth taken as user-input
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter height of box (in cm): ");
			double height = scanner.nextDouble();
			
			System.out.print("Enter width of box (in cm): ");
			double width = scanner.nextDouble();
			
			System.out.print("Enter height of box (in cm): ");
			double depth = scanner.nextDouble();
			
			double volume = Box.volume(height, width, depth);
			System.out.printf("Volume of a box of dimensions %.2f x %.2f x %.2f = %.2f sq. cm\n", height, width, depth, volume);
		}
		
	}

}
