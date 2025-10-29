package BookProject;

public class Library {


    static void main() {
        Book b = new Book("Love life ", "lia", "234");
        Book b2 = new Book("L234");
        System.out.println("Total books:" + Book.getTotalbook());
        b.borrowBook();
        b.returnBook();

        Course c = new Course();
        Course c1 = new Course();
        c.enrollStudent("nasima");
        c.enrollStudent("nima");
        c.unEnrollStudent("nima");
        c.unEnrollStudent("nasima");
    }
}
