import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        double temperature;
        try (Scanner input = new Scanner(System.in)) {
            byte choice;
            System.out.println("Welcome to my temperature conversion program!");

            do {
                System.out.println("1. Celcius to Farenheit\n2. Farenheit to Celcius\nX. Any other number to quit");
                System.out.print("Choose an option: ");
                choice = input.nextByte();

                if (choice != 1 && choice != 2) {
                    System.out.println("Program has ended.");
                    break;
                }

                System.out.print("Enter temperature: ");
                temperature = input.nextDouble();

                switch (choice) {
                    case 1:
                        celciusToFarenheit(temperature);
                        break;
                    case 2:
                        farenheitToCelcius(temperature);
                        break;
                }

            } while (choice == 1 || choice == 2);
        }
    }

    static void celciusToFarenheit(double temperature) {
        final double farenheit = (temperature * 1.8) + 32;
        System.out.printf("%.2f°C in Farenheit: %.2f°F\n", temperature, farenheit);
    }

    static void farenheitToCelcius(double temperature) {
        final double celcius = (temperature - 32) / 1.8;
        System.out.printf("%.2f°F in Celcius: %.2f°C\n", temperature, celcius);
    }
}
