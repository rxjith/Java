package module2;
import java.util.Scanner;

class Fibonacci {
	public static int a = 0, b = 1, f = 0;
	public void fibonacci(int n) {
		if (n > 0) {
			f = a + b;
			a = b;
			b = f;
			System.out.print(" " + f);
			fibonacci(n-1);
		}
	}
}
public class RecursiveFibonacci {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			Fibonacci f = new Fibonacci();
			
			System.out.print("Enter limit: ");
			int n = scanner.nextInt();
			
			System.out.print("0" + " " + "1");
			f.fibonacci(n-2);
		}

	}

}
