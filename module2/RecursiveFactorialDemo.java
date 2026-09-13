package module2;
import java.util.Scanner;

class Factorial {
	public int factorial(int n) {
		if (n == 0) return 1;
		return (n * factorial(n-1));
	}
}

public class RecursiveFactorialDemo {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			Factorial f = new Factorial();
			System.out.print("Enter n: ");
			int n = scanner.nextInt();
			int fact = f.factorial(n);
			System.out.printf("Factorial of %d: %d\n", n, fact);
		}
	}

}
