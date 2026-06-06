import Dice.Die;
import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static byte rolls = 0;
    public static void main(String[] args) {
        System.out.println("Dice Rolling Program:");
        System.out.print("Enter number of dice to roll: ");
        int numberOfRolls = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < numberOfRolls; i++) {
            rolls += dieRoller(numberOfRolls);
        }
        System.out.printf("Total of all rolls: %d\n", rolls);
    }

    static byte dieRoller(int numberOfRolls) {
        int randomNumber = random.nextInt(1, 7);
        switch (randomNumber) {
            case 1:
                return (Die.one());
            case 2:
                return (Die.two());
            case 3:
                return (Die.three());
            case 4:
                return (Die.four());
            case 5: 
                return (Die.five());
            case 6:
                return (Die.six());
            default:
                System.out.println("Invalid choice!");
                return 0;
        }
    }
}