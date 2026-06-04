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
            System.out.print("Enter principal amount: ");
            principal = input.nextDouble();
            
            System.out.print("Enter annual interest: ");
            rate = input.nextDouble();

            System.out.print("Enter time (in years): ");
            time = input.nextInt();

            double r = rate / MONTHS_IN_A_YEAR / PERCENT;
            int n = time * MONTHS_IN_A_YEAR;

            NumberFormat currency = NumberFormat.getCurrencyInstance();
            double emi = principal * (r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
            System.out.printf("Your mortgage per month is: %s\n", currency.format(emi));
        }
    }
}
