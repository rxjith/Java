package Tutorial4;
import java.util.Scanner;

/* 1. Create a class Employee with:
	Instance variables: empId, empName, salary
	A constructor that initializes values
	A method displayEmployee() to display details
	Take input for two employees and print their data. 
*/

class Employee {
	int empID;
	String empName;
	double salary;
	
	Employee() {
		empID = -1;
		empName = "N/A";
		salary = 0.0;
	}
	
	Employee(int empID, String empName, double salary) {
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}
	
	void displayEmployee() {
		System.out.println("Employee ID: " + empID);
		System.out.println("Employee name: " + empName);
		System.out.println("Salary: " + salary);
	}
}

public class employeeDemo {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter employee ID of Employee 1: ");
			int empID1 = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.print("Enter employee 1's name: ");
			String name1 = scanner.nextLine();
			
			System.out.print("Enter salary of employee 1: ");
			double salary1 = scanner.nextDouble();
			
			Employee emp1 = new Employee(empID1, name1, salary1);
			emp1.displayEmployee();
			
			System.out.print("Enter employee ID of Employee 2: ");
			int empID2 = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.print("Enter employee 2's name: ");
			String name2 = scanner.nextLine();
			
			System.out.print("Enter salary of employee 2: ");
			double salary2 = scanner.nextDouble();
			
			Employee emp2 = new Employee(empID2, name2, salary2);
			emp2.displayEmployee();
		}
		
	}

}
