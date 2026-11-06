package Tutorial8;

// Base class
class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("--- General Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Derived class 1
class Technical extends Book {
    String subject;

    Technical(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("--- Technical Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}

// Derived class 2
class Story extends Technical {
    String genre;

    Story(String title, String author, String subject, String genre) {
        super(title, author, subject);
        this.genre = genre;
    }

    @Override
    public void display() {
        System.out.println("--- Story Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
        System.out.println("Genre: " + genre);
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        // Creating objects of all three classes
        Book generalBook = new Book("The Art of Computer Programming", "Donald Knuth");
        Book techBook = new Technical("Clean Code", "Robert C. Martin", "Software Engineering");
        Book storyBook = new Story("The Hobbit", "J.R.R. Tolkien", "Literature", "High Fantasy");

        // Demonstrating runtime polymorphism using a Book reference variable
        System.out.println("=== Demonstrating Runtime Polymorphism ===");

        generalBook.display();
        System.out.println();

        techBook.display(); // Calls Technical's overridden display() method
        System.out.println();

        storyBook.display(); // Calls Story's overridden display() method
    }
}
