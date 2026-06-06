import java.util.Scanner;                                                           // Scanner method

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);                                // Initializing scanner
    static double balance = 0;                                                      // Static balance
    static boolean flag = true;                                                     // loop controller
    public static void main(String[] args) {
        while (flag) {
            menu();                                                                 // menu method
            System.out.print("Enter your choice (1-4): ");                          // Prompting user to enter their choice
            int choice = scanner.nextInt();                                         // Switch construct to filter choices
            switch (choice) {
                case 1:                                     
                    balance();                                                      // balance object call
                    break;
                case 2:
                    balance += deposit();                                           // add deposit object return value to balance
                    break;
                case 3:
                    balance -= withdraw(balance);                                   // subtract withdraw object return value from balance
                    break;
                case 4:
                    scanner.close();                                                // closing scanner to avoid resource leakage
                    flag = false;                                                   // loop controller flag set to false to stop the loop
                    break;
                default:
                    System.out.println("INVALID CHOICE YA H3MAR! TRY AGAIN!");      // placeholder message to indicate invalid choice
            }   
        }
    }

    static void starPrinter(int n) {
        System.out.println("*".repeat(n));                                          // printing stars for aesthetics
    }

    static void menu() {
        starPrinter(20);
        System.out.println("BANKING PROGRAM");
        starPrinter(20);
        System.out.println("1. Show Balance");                                      // menu object definition
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        starPrinter(20);
    }

    static void balance() {
        System.out.printf("Balance: $%.2f\n", balance);                             // display balance
    }

    static double deposit() {
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        if (depositAmount <= 0) {
            System.out.println("Please enter a valid amount!");                     // conditional check to avoid illicit actions
            return 0;
        }
        System.out.printf("You've successfully deposited $%.2f!\n", depositAmount); // success message
        return (depositAmount);                                                     // returns deposited amount
    }

    static double withdraw(double balance) {
        System.out.print("Enter amount to withdraw: ");
        double withdrawalAmount = scanner.nextDouble();
        if (withdrawalAmount > balance) {
            System.out.println("You can't withdraw an amount greater than your balance!");
            return 0;                                                               // conditional to avoid illicit actions
        }
        System.out.printf("You've successfully withdrawn $%.2f!\n", withdrawalAmount); // success message
        return (withdrawalAmount);                                                  // returns withdrawn amount
    }
}
// THE END //