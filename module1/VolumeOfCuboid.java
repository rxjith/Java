package module1;
import java.util.Scanner;

class Volume {
	double height, width, depth;
	
	Volume() {
		height = width = depth = 1;
	}
	Volume(double h, double w, double d) {
		height = h;
		width = w;
		depth = d;
	}
	
	double volume () {
		return (height * width * depth);
	}
}
public class VolumeOfCuboid {

	public static void main(String[] args) {
		// Volume of a cuboid
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the height of the cuboid (in cm): ");
			double height = scanner.nextDouble();
			
			System.out.print("Enter the width of the cuboid (in cm): ");
			double width = scanner.nextDouble();
			
			System.out.print("Enter the depth of the cuboid (in cm): ");
			double depth = scanner.nextDouble();
			
			Volume volumizer = new Volume(height, width, depth);
			double volume = volumizer.volume();
			
			System.out.print("Volume: " + volume + " cu. cm");
		}
		
	}

}
