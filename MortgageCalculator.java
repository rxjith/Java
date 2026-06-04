import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        double principal, rate;
        int time;
        final byte MONTHS_IN_A_YEAR = 12;
        final byte PERCENT = 100;
        System.out.println("Welcome to my mortgage calculator!");
        try (Scanner input = new Scanner(System.in)) {
            // Prinicpal validation:
            while (true) {
                System.out.print("Enter principal amount: ");
                principal = input.nextDouble();

                if (!(principal > 1_000) || !(principal <= 1_000_000)) {
                    System.out.println("Please enter an amount from $1K - $1M!");
                } else {
                    break;
                }
            }

            // Period validation:
            while (true) {    
                System.out.print("Enter annual interest: ");
                rate = input.nextDouble();

                if (!(rate > 0) || !(rate <= 30)) {
                    System.out.println("Please enter an amount greater than 0 and less than or equal to 30!");
                } else {
                    break;
                }
            }

            // Rate validation:
            while (true) {
                System.out.print("Enter time (in years): ");
                time = input.nextInt();

                if (!(time >= 1) || !(time <= 30)) {
                    System.out.println("Please enter a period between 1 and 30 years!");
                } else {
                    break;
                }
            }

            double r = rate / MONTHS_IN_A_YEAR / PERCENT;
            int n = time * MONTHS_IN_A_YEAR;

            NumberFormat currency = NumberFormat.getCurrencyInstance();
            double emi = principal * (r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
            System.out.printf("Your mortgage per month is: %s\n", currency.format(emi));
        }
    }
}
