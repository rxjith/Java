package Tutorial2;
import java.util.Scanner;

public class simpleCalculator {

	public static void main(String[] args) {
		// Create a calculator that takes two numbers and an operator (+, -, *, /) and uses switch to perform the operation.
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter 1st operand: ");
			int a = scanner.nextInt();
			System.out.print("Enter operator: ");
			char op = scanner.next().charAt(0);
			System.out.print("Enter 2nd operand: ");
			int b = scanner.nextInt();
			
			float result = 0;
			
			switch (op) {
				case '+':
					result = (a + b);
					break;
				case '-':
					result = (a - b);
					break;
				case '*':
					result = (a * b);
					break;
				case '/':
					result = (a / (float) b);
					break;
			}
			
			if (result != 0) {
				System.out.println("Result: " + result);
			} else {
				System.out.println("You entered an invalid operator!");
			}
		}

	}

}
