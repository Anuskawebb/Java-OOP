class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

class Library {
    private String name;
    private Book[] books;
    private int count;

    public Library(String name, int capacity) {
        this.name = name;
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        }
    }

    public void listBooks() {
        for (int i = 0; i < count; i++) {
            books[i].displayInfo();
            System.out.println();
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 9.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 7.99);

        Library library = new Library("Central Library", 5);
        library.addBook(book1);
        library.addBook(book2);

        library.listBooks();
    }
}
