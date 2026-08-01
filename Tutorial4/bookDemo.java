package Tutorial4;
import java.util.Scanner;

/* Create a class "Book" with:
 * variables: title, author, and price
 * method to display book info
*/

class Book {
	String title, author;
	float price;
	
	Book() {
		title = "N/A";
		author = "N/A";
		price = 0.0f;
	}
	
	Book(String title, String author, float price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void display() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
}

public class bookDemo {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			for (int i = 0; i < 2; i++) {
				
				System.out.printf("Enter title of book %d: ", i + 1);
				String title = scanner.nextLine();
				
				System.out.printf("Enter author of book %d: ", i + 1);
				String author = scanner.nextLine();
				
				System.out.printf("Enter price of book %d: ", i + 1);
				float price = scanner.nextFloat();
				
				scanner.nextLine();
				
				Book book = new Book(title, author, price);
				book.display();
				
			}
			
		}

	}

}
