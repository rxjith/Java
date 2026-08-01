package module1;
import java.util.Scanner;

class StudentData {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	
	public void setName(String myName) {
		name = myName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int myAge) {
		if (myAge > 0) {
			age = myAge;
		}
	}
}

public class privateDemo {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			StudentData student = new StudentData(); 
			
			System.out.print("Enter student's name: ");
			String name = scanner.nextLine();
			student.setName(name);
			
			System.out.print("Enter student's age: ");
			int age = scanner.nextInt();
			student.setAge(age);
			
			System.out.println("\nStudent data:");
			System.out.println("Name: " + student.getName());
			System.out.println("Age: " + student.getAge());
		}
	
	}

}
