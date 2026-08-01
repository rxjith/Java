package module1;
import java.util.Scanner;

class Book {
	String title;
	String author;
	double price;
	
	Book() {
		title = "Unknown";
		author = "Not Assigned";
		price = 0.0;
	}
	
	Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void displayDetails() {
		System.out.println("Details of the book:");
		System.out.println("Title of the book: " + title);
		System.out.println("Author of the book: " + author);
		System.out.println("Price of the book: " + price);
		System.out.println();
	}
}

public class Books {

	public static void main(String[] args) {
		 
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter title of the book: ");
			String title = scanner.nextLine();
			System.out.print("Enter author of the book: ");
			String author = scanner.next();
			System.out.print("Enter price of the book: ");
			double price = scanner.nextDouble();
			
			Book book1 = new Book();
			Book book2 = new Book(title, author, price);
			
			book1.displayDetails();
			book2.displayDetails();
		}
	}

}
