package BookProject;

import java.util.logging.Logger;

public class Book {
    public static final Logger logger = Logger.getLogger(Book.class.getName());
    static int totalBook;

    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBook = 0;
    }

    {
        totalBook++;
    }

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    Book(String isbn) {
        this(isbn, "unknown", "Unknown");
    }

    void borrowBook() {
        if (isBorrowed) {
            logger.info("someone already took it ");
        } else {
            isBorrowed=true;
            logger.info("happy reading " +this.title );
        }

    }

    void returnBook() {
        if (isBorrowed) {
            isBorrowed=false;
            System.out.println("thanks for returning "+ this.title);
        } else {
            System.out.println("not from our shops");
        }
    }

    public static int getTotalbook() {
        return totalBook;
    }
}
