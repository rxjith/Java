package Dice;

public class Die {
    public static byte one() {
        horizontalLine();
        verticalSpacer();
        System.out.println("|   O   |");
        verticalSpacer();
        horizontalLine();
        System.out.println("You rolled: 1");
        return 1;
    }

    public static byte two() {
        horizontalLine();
        System.out.println("|  O    |");
        System.out.println("|    O  |");
        horizontalLine();
        System.out.println("You rolled: 2");
        return 2;
    }

    public static byte three() {
        horizontalLine();
        System.out.println("|  O    |");
        System.out.println("|   O   |");
        System.out.println("|    O  |");
        horizontalLine();
        System.out.println("You rolled: 3");
        return 3;
    }

    public static byte four() {
        horizontalLine();
        System.out.println("|  O O  |");
        System.out.println("|  O O  |");
        horizontalLine();
        System.out.println("You rolled: 4");
        return 4;
    }

    public static byte five() {
        horizontalLine();
        System.out.println("|  O O  |");
        System.out.println("|   O   |");
        System.out.println("|  O O  |");
        horizontalLine();
        System.out.println("You rolled: 5");
        return 5;
    }

    public static byte six() {
        horizontalLine();
        System.out.println("|  O O  |");
        System.out.println("|  O O  |");
        System.out.println("|  O O  |");
        horizontalLine();
        System.out.println("You rolled: 6");
        return 6;
    }
    
    static void horizontalLine() {
        System.out.println(" " + "-".repeat(7) + " ");
    }
    
    static void verticalSpacer() {
        System.out.println("|" + " ".repeat(7) + "|");
    }
}
