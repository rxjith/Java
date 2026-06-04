import java.util.Scanner;

public class weightConverter {
    static double weight;
    final static double kgEquivalent = 0.453592;
    final static double lbsEquivalent = 2.204621;

    public static void main(String[] args) {
        System.out.println("Welcome to my weight conversion program!");

        try (Scanner input = new Scanner(System.in)) {
            byte choice;

            do {
                System.out.println("1. Convert lbs to kgs\n2. Convert kgs to lbs\nx. Any other number to quit");
                System.out.print("Choose an option: ");
                choice = input.nextByte();

                if (choice != 1 && choice != 2) {
                    System.out.println("Program has ended.");
                    break;
                }

                System.out.print("Enter weight: ");
                weight = input.nextDouble();

                switch (choice) {
                    case 1:
                        poundsToKilos(weight);
                        break;
                    case 2:
                        kilosToPounds(weight);
                        break;
                }

            } while (choice == 1 || choice == 2);
        }
    }

    static void poundsToKilos(double weight) {
        double kilos = weight * kgEquivalent;
        System.out.printf("%.2flbs in kgs: %.2fkgs%n", weight, kilos);
    }

    static void kilosToPounds(double weight) {
        double pounds = weight * lbsEquivalent;
        System.out.printf("%.2fkgs in lbs: %.2flbs%n", weight, pounds);
    }
}