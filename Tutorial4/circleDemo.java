package Tutorial4;
import java.util.Scanner;

/* Create a class "circle" with:
 * instance variable: radius
 * method to compute and display the circumference and area
 */

class Circle {
	float radius;
	
	Circle () {
		radius = 0.0f;
	}
	
	Circle(float radius) {
		this.radius = radius;
	}
	
	void circumference() {
		System.out.printf("Circumference of circle of radius %.2f cm: %.2f cm\n", radius, 2 * Math.PI * radius);
	}
	
	void area() {
		System.out.printf("Area of circle of radius %.2f cm: %.2f sq. cm\n", radius, Math.PI * radius * radius);
	}
}

public class circleDemo {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter radius of the circle: ");
			float radius = scanner.nextFloat();
			
			Circle circle = new Circle(radius);
			circle.circumference();
			circle.area();
			
		}

	}

}
