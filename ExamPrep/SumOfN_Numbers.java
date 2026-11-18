package ExamPrep;

import java.util.Scanner;

public class SumOfN_Numbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = scanner.nextInt();
            int sum = 0;

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("Enter number %d: ", i + 1);
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }

            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
