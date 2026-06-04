import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    final static byte MONTHS_IN_A_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to my mortgage calculator!");

        try (Scanner input = new Scanner(System.in)) {

            double principal = readNumber(input, "Enter a principal amount from $1K - $1M: ", 1_000, 1_000_000);

            double rate = readNumber(input, "Enter rate of interest (0-30): ", 0, 30);

            int time = (int) readNumber(input, "Enter tenure of mortgage (1-30): ", 1, 30);

            double mortgage = calculateMortgage(principal, rate, time);
            printMortgage(mortgage);
        }
    }

    static double readNumber(Scanner input, String prompt, double min, double max) {
        while (true) {
            System.out.print(prompt);
            double value = input.nextDouble();

            if (value > min && value <= max)
                return value;

            System.out.printf("Invalid! Enter a value between %.0f and %.0f%n", min, max);
        }
    }

    static double calculateMortgage(double principal, double annualInterest, int time) {
        double r = annualInterest / MONTHS_IN_A_YEAR / PERCENT;
        int n = time * MONTHS_IN_A_YEAR;
        return principal * (r * Math.pow(1 + r, n)) / (Math.pow(1+r, n) - 1);
    }

    static void printMortgage(double mortgage) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Your mortgage per month is: " + currency.format(mortgage));
    }
}