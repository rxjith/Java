import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String name;                                        // String declaration
        try (Scanner input = new Scanner(System.in)) {      // Try-with-Resources method
            System.out.print("Enter your name: ");          // Prompting...
                name = input.nextLine();                    // User input
        }           
        System.out.println("Hello, " + name + "!");         // Printing greeting
    }    
}
