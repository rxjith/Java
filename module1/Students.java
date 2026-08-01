package module1;
import java.util.Scanner;

class Student {
	String name;
	int rollNo;
	String department;
	
	Student() {
		name = "Unknown";
		rollNo = -1;
		department = "Unknown";
	}
	
	Student(String name, int rollNo, String department) {
		this.name = name;
		this.rollNo = rollNo;
		this.department = department;
	}
	
	void printStudent() {
		System.out.println("Details of the student:");
		System.out.println("Name: " + name);
		System.out.println("Roll number: " + rollNo);
		System.out.println("Department: " + department);
	}
}

public class Students {
	
	public static void main(String[] args) {
		
		/* WAJP which creates a class Student with the following instance variables: 
		 * name, rollno, and dept. Create a parameterized constructor to initialize 
		 * the object and use "this" keyword. Display the students information 
		 * using a method called printStudent(). */
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter name of student: ");
			String name = scanner.nextLine();
			
			System.out.print("Enter students roll number: ");
			int rollNo = scanner.nextInt();
			
			scanner.nextLine(); // Consumes the previous "\n" from integer input
			
			System.out.print("Enter students department: ");
			String department = scanner.nextLine();
			
			Student s1 = new Student();
			Student s2 = new Student(name, rollNo, department);
			
			s1.printStudent();
			s2.printStudent();

		}
	}
	
}
