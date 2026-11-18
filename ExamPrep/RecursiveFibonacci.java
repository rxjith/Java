package ExamPrep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursiveFibonacci {
    static int a = 0, b = 1, c = 0;

    private static void fibonacci(int count) {
        if (count > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
            fibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of terms to print: ");
            int count = scanner.nextInt();
            System.out.print(a + " " + b);
            fibonacci(count - 2);
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("NUMBER FORMAT EXCEPTION AYY! >T-T<");
        } catch (InputMismatchException e) {
            System.out.println("You blind or what? ENTER A NUMBER!!! ~tchew");
        } catch (Exception e) {
            System.out.println("Something went wrong :/\nException: " + e.getMessage());
        }
    }
}
