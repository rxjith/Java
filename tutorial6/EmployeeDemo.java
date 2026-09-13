package tutorial6;

class Employee {
	
	protected int salary;
	
	Employee(int salary) {
		this.salary = salary;
	}
	
	protected void showSalary() {
		System.out.println("Salary: " + salary);
	}

}

class Manager extends Employee {
	
	Manager(int salary) {
		super(salary);
	}
	
	void display() {
		System.out.println("Managers salary: " + salary);
		showSalary();
	}
}

public class EmployeeDemo {
	
	public static void main(String[] args) {
	
		Manager manager = new Manager(5000000);
		manager.display();
		
	}
}