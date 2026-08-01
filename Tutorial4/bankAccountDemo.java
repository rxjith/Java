package Tutorial4;
import java.util.Scanner;

/* create a class "BankAccount" with:
 * variables: accountNumber, accountHolder, balance
 * constructor to initialize details 
 * methods: deposit(amount) and displayDetails()
*/

class BankAccount {
	long accountNumber;
	String accountHolder;
	double balance;
	
	BankAccount() {
		accountNumber = -1;
		accountHolder = "N/A";
		balance = 0.0D;
	}
	
	BankAccount(long accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	double deposit(double amount) {
		balance += amount;
		return balance;
	}
	
	void displayDetails() {
		System.out.println("\n-------- ACCOUNT DETAILS --------");
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolder);
		System.out.printf("Balance: Rs. %.2f\n", balance);
		System.out.println("---------------------------------");
	}
	
}

public class bankAccountDemo {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter account number: ");
			long accountNumber = scanner.nextLong();
			
			scanner.nextLine();
			
			System.out.print("Enter account holder name: ");
			String accountHolder = scanner.nextLine();
			
			double balance = 0.0D;
			
			BankAccount user1 = new BankAccount(accountNumber, accountHolder, balance);
			
			user1.displayDetails();
			
			System.out.print("Enter amount to deposit into account: ");
			double amount = scanner.nextDouble();
			
			user1.deposit(amount);
			user1.displayDetails();
			
		}

	}

}
