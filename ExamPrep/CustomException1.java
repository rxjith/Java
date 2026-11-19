package ExamPrep;

import java.util.Scanner;

class AgeException extends Exception {
    private String message;

    public AgeException(String msg) {
        message = msg;
    }

    public String getMessage() {
        return message;
    }
}

public class CustomException1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            try {
                if (age <= 12 || age > 60) {
                    throw new AgeException("Ineligible.");
                }
                else {
                    System.out.println("Registration complete, thank you!");
                }
            } catch (AgeException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
