import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        // Currency Formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // getCurrencyInstance is a factory method (creates an instance)
        String resultCurrencyString = currency.format(1234567.891); // The format method for the currency object returns a string
        System.out.println(resultCurrencyString);

        // Percentage Formatting
        String resultPercentageString = NumberFormat.getPercentInstance().format(0.151);   // Used method chaining here
        System.out.println(resultPercentageString);
    }
}
