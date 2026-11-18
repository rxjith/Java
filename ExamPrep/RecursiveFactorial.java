package ExamPrep;

import java.util.Scanner;

public class RecursiveFactorial {
    private static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = scanner.nextInt();

            System.out.println("Factorial of " + n + ": " + factorial(n));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered! Exception: " + e.getMessage());
        }
    }
}
