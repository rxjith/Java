package module2;

class Person {
    String name;
    int age;
    String email;
    String address;
    double salary;

    public Person(String name, int age, String email, String address, double salary) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Salary: $" + salary);
    }
}

class Student extends Person {
    String major;

    public Student(String name, int age, String email, String address, double salary, String major) {
        super(name, age, email, address, salary);
        this.major = major;
    }

    public void displayMajor() {
        System.out.println("Major: " + major);
    }
}

class Instructor extends Person {
    String subject;

    public Instructor(String name, int age, String email, String address, double salary, String subject) {
        super(name, age, email, address, salary);
        this.subject = subject;
    }

    public void displaySubject() {
        System.out.println("Subject: " + subject);
    }
}

public class inheritanceHW {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, "johndoe@example.com", "Little St. James Island", 1200.0, "Computer Science");
        Instructor instructor = new Instructor("John Doe Dee", 45, "johndoedee@example.com", "Little St. James Island", 75000.0, "Java Programming");

        System.out.println("=== Student Details ===");
        student.displayPersonInfo();
        student.displayMajor();

        System.out.println();

        System.out.println("=== Instructor Details ===");
        instructor.displayPersonInfo();
        instructor.displaySubject();
    }
}