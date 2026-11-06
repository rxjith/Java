/* Create a user defined Exception ‘InvalidNumberException’.
   Write a Java program that computes the Sum and average of N positive numbers
   given as Userinput from Keyboard. Raise the Exception ‘InvalidNumberException’
   on reading a negative number or zero as input...
   The custom exception is thrown when an invalid number is encountered.
*/

package Tutorial12;

import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class SumAndAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("N must be a positive integer greater than 0.");
            scanner.close();
            return;
        }

        double sum = 0;
        int count = 0;

        while (count < n) {
            try {
                System.out.print("Enter number " + (count + 1) + ": ");
                double num = scanner.nextDouble();

                if (num <= 0) {
                    throw new InvalidNumberException("Invalid number! " + num + " is not allowed!");
                }

                sum += num;
                count++;
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
                System.out.println("Please try entering that number again.");
            } catch (Exception e) {
                System.out.println("Invalid input type. Please enter a valid number!");
                scanner.next();
            }
        }

        double average = sum / (float) n;

        System.out.println("\n--- Calculation Results ---");
        System.out.println("Sum of the " + n + " numbers: " + sum);
        System.out.println("Average of the " + n + " numbers: " + average);

        scanner.close();
    }
}
