package Tutorial10;

import java.util.Scanner;

import Tutorial10.evenpackage.Even;

public class EvenDemo {
    public static void main(String[] args) {
        int n;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            n = scanner.nextInt();
            boolean isEven = Even.EvenChecker(n);
            if (isEven) System.out.println(n + " is even!");
            else System.out.println(n + " is odd!");
        }
    }
}
