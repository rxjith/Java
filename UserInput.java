import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        String name;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
                name = input.nextLine();
        }
        System.out.println("Hello, " + name + "!");
    }    
}
