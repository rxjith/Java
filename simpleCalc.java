import java.util.Scanner;

public class simpleCalc {
    public static void main(String[] args) {
        double a, b;
        char operator;
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Enter the first number: ");
            a = input.nextDouble();
            
            System.out.print("Enter an operator (+, -, *, /, ^): ");
            operator = input.next().charAt(0);
            
            System.out.print("Enter the second number: ");
            b = input.nextDouble();

            calculate(a, operator, b);
        }
    }

    static void calculate(double a, char operator, double b) {
        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '^':
                System.out.println(Math.pow(a, b));
                break;
            default:
                System.out.println("Invalid operator. Please try again!");
        }
    }
}