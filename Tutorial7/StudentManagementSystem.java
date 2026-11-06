package Tutorial7;

import java.util.Scanner;

class Students {
    String name, course;
    int rollNo;

    Students(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class StudentAccount extends Students {
    float collegeFee;

    StudentAccount(int rollNo, String name, String course, float collegeFee) {
        super(rollNo, name, course);
        this.collegeFee = collegeFee;
    }

    public void displayFee() {
        System.out.println("College Fee: " + collegeFee);
    }
}

class Hosteller extends StudentAccount {
    float hostelFee, messFee;

    Hosteller(int rollNo, String name, String course, float collegeFee, float hostelFee, float messFee) {
        super(rollNo, name, course, collegeFee);
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }

    public void displayHostelDetails() {
        System.out.println("\n--- Hosteller Details ---");
        displayDetails();
        super.displayFee();
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        float totalFee = collegeFee + hostelFee + messFee;
        System.out.println("Total Fee (College + Hostel + Mess): " + totalFee);
    }
}

class DayScholar extends StudentAccount {
    float busFee;

    DayScholar(int rollNo, String name, String course, float collegeFee, float busFee) {
        super(rollNo, name, course, collegeFee);
        this.busFee = busFee;
    }

    public void displayDayScholarDetails() {
        System.out.println("\n--- Day Scholar Details ---");
        displayDetails();
        super.displayFee();
        System.out.println("Bus Fee: " + busFee);
        float totalFee = collegeFee + busFee;
        System.out.println("Total Fee (College + Bus): " + totalFee);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // --- Read Hosteller Details ---
            System.out.println("=== Enter Hosteller Details ===");
            System.out.print("Enter student's name: ");
            String hName = scanner.nextLine();
            System.out.print("Enter student's roll number: ");
            int hRollNo = scanner.nextInt();
            scanner.nextLine(); // consumes leftover newline char
            System.out.print("Enter student's course: ");
            String hCourse = scanner.nextLine();
            System.out.print("Enter college fee: ");
            float hCollegeFee = scanner.nextFloat();
            System.out.print("Enter hostel fee: ");
            float hHostelFee = scanner.nextFloat();
            System.out.print("Enter mess fee: ");
            float hMessFee = scanner.nextFloat();
            scanner.nextLine(); // consumes leftover newline char

            Hosteller hosteller = new Hosteller(hRollNo, hName, hCourse, hCollegeFee, hHostelFee, hMessFee);

            // --- Read Day Scholar Details ---
            System.out.println("\n=== Enter Day Scholar Details ===");
            System.out.print("Enter student's name: ");
            String dName = scanner.nextLine();
            System.out.print("Enter student's roll number: ");
            int dRollNo = scanner.nextInt();
            scanner.nextLine(); // consumes leftover newline char
            System.out.print("Enter student's course: ");
            String dCourse = scanner.nextLine();
            System.out.print("Enter college fee: ");
            float dCollegeFee = scanner.nextFloat();
            System.out.print("Enter bus fee: ");
            float dBusFee = scanner.nextFloat();

            DayScholar dayScholar = new DayScholar(dRollNo, dName, dCourse, dCollegeFee, dBusFee);

            // --- Display All Details ---
            hosteller.displayHostelDetails();
            dayScholar.displayDayScholarDetails();
        }
    }
}
