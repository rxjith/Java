package Tutorial7;
import java.util.Scanner;

class Employee {
    String name, address;
    int age; long mob;
    float sal;

    Employee (String name, String address, int age, long mob, float sal) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mob = mob;
        this.sal = sal;
    }

    public void print_Salary() {
        System.out.println("Salary: " + sal);
    }
}

class Officer extends Employee {
    String spl;

    Officer (String name, String address, int age, long mob, float sal, String spl) {
        super(name, address, age, mob, sal);
        this.spl = spl;
    }

    public void print_Specialization() {
        System.out.println("Specialization: " + spl);
    }
}

class Manager extends Employee {
    String dep;

    Manager (String name, String address, int age, long mob, float sal, String dep) {
        super(name, address, age, mob, sal);
        this.dep = dep;
    }

    public void print_Dept() {
        System.out.println("Department: " + dep);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        String oName, mName, oAddress, mAddress, spl, dep;
        int oAge, mAge; long oMob, mMob;
        float oSal, mSal;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter officer's name: ");
            oName = scanner.nextLine();
            System.out.print("Enter officer's address: ");
            oAddress = scanner.nextLine();
            System.out.print("Enter officer's age: ");
            oAge = scanner.nextInt();
            System.out.print("Enter officer's mobile number: ");
            oMob = scanner.nextLong();
            System.out.print("Enter officer's salary: ");
            oSal = scanner.nextFloat();
            scanner.nextLine(); // consumes remaining newline char
            System.out.print("Enter officer's specialization: ");
            spl = scanner.nextLine();
            System.out.println();

            Officer officer = new Officer(oName, oAddress, oAge, oMob, oSal, spl);

            System.out.println("Enter manager's name: ");
            mName = scanner.nextLine();
            System.out.println("Enter manager's address: ");
            mAddress = scanner.nextLine();
            System.out.println("Enter manager's age: ");
            mAge = scanner.nextInt();
            System.out.println("Enter manager's mobile number: ");
            mMob = scanner.nextLong();
            System.out.println("Enter manager's salary: ");
            mSal = scanner.nextFloat();
            scanner.nextLine(); // consumes remaining newline char
            System.out.println("Enter manager's department: ");
            dep = scanner.nextLine();
            System.out.println();

            Manager manager = new Manager(mName, mAddress, mAge, mMob, mSal, dep);

            System.out.println("--- Officer details ---");
            System.out.println("Officer's name: " + officer.name + "\n" +
                               "Officer's address: " + officer.address + "\n" +
                               "Officer's age: " + officer.age + "\n" +
                               "Officer's mobile number: " + officer.mob);
            officer.print_Salary();
            officer.print_Specialization();

            System.out.println("\n--- Manager details ---");
            System.out.println("Manager's name: " + manager.name + "\n" +
                               "Manager's address: " + manager.address + "\n" +
                               "Manager's age: " + manager.age + "\n" +
                               "Manager's mobile number: " + manager.mob);
            manager.print_Salary();
            manager.print_Dept();
        }
    }
}
