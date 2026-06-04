import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("What item would you like to buy?: ");
            String name = input.nextLine();

            System.out.printf("What is the price for each %s: ", name);
            float price = input.nextFloat();

            System.out.print("How many would you like?: ");
            int quantity = input.nextInt();

            System.out.printf("You have purchased %d %s(s)\n", quantity, name);
            System.out.printf("Your total is: $%.2f\n", quantity*price);
        }
    }
}
