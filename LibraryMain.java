package main;
import dao.BookDAO;
import model.Book;


public class LibraryMain {

	public static void main(String[] args) {
		BookDAO dao = new BookDAO();

        
        Book b1 = new Book(1, "Java Programming", "James Gosling");
        Book b2 = new Book(2, "Python Basics", "Guido Van Rossum");

        // Add books
        dao.addBook(b1);
        dao.addBook(b2);

        // View books
        System.out.println("Library Books List:");
        dao.viewBooks();
	}

}
