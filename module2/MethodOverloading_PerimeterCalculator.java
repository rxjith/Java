package module2;
import java.util.Scanner;

class Perimeter {
	
	double perimeter(double radius) {
		return (2 * Math.PI * radius);
	}
	
	double perimeter(double side1, double side2, double side3) {
		return (side1 + side2 + side3);
	}
	
	double perimeter(int side) {
		return (4 * side);
	}
	
	double perimeter(double a, double b, double c, double d) {
		return (a + b + c + d);
	}
}

public class MethodOverloading_PerimeterCalculator {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			while (true) {
				System.out.println("-------------------------------------------------------");
				System.out.println("Enter which shapes perimeter you want to calculate: ");
				System.out.println("-------------------------------------------------------");
				System.out.println("1. Circle");
				System.out.println("2. Triangle");
				System.out.println("3. Shape");
				System.out.println("4. Trapezium");
				System.out.println("5. Exit");
				System.out.println("-------------------------------------------------------");
				System.out.print("Enter choice: ");
				int choice = scanner.nextInt();
				System.out.println("-------------------------------------------------------");
				Perimeter shape = new Perimeter();
				switch (choice) {
					case 1:
						System.out.print("Enter radius of the circle: ");
						double radius = scanner.nextDouble();
						double circumference = shape.perimeter(radius);
						System.out.printf("Circumference: %.2f\n", circumference);
						break;
						
					case 2:
						System.out.print("Enter side 1: ");
						double side1 = scanner.nextDouble();
						
						System.out.print("Enter side 2: ");
						double side2 = scanner.nextDouble();
						
						System.out.print("Enter side 3: ");
						double side3 = scanner.nextDouble();
						
						double perimeter = shape.perimeter(side1, side2, side3);
						System.out.printf("Permieter: %.2f\n", perimeter);
						break;
						
					case 3:
						System.out.print("Enter side: ");
						int side = scanner.nextInt();
						double perimeterOfSquare = shape.perimeter(side);
						System.out.printf("Perimeter of square: %.2f\n", perimeterOfSquare);
						break;
						
					case 4:
						System.out.print("Enter side 1: ");
						double tside1 = scanner.nextDouble();
						
						System.out.print("Enter side 2: ");
						double tside2 = scanner.nextDouble();
						
						System.out.print("Enter side 3: ");
						double tside3 = scanner.nextDouble();
						
						System.out.print("Enter side 4: ");
						double tside4 = scanner.nextDouble();
						
						double perimeterOfTrapezium = shape.perimeter(tside1, tside2, tside3, tside4);
						System.out.printf("Perimeter of trapezium: %.2f\n", perimeterOfTrapezium);
						break;
						
					case 5:
						return;
						
					default:
						System.out.println("Invalid choice, please try again!\n");
				}
				
				
			}
		}

	}

}
