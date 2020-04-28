import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    Book bookA;
    Book bookB;

    @Before
    public void before() {
        library = new Library();
        bookA = new Book("The Book of Five Rings", "Miyamoto Musashi", "Philosophy");
        bookB = new Book("Blood Meridian", "Cormac McCarthy", "Western");
    }

    @Test
    public void stockSize() {
        assertEquals(0, library.stockSize());
    }

    @Test
    public void AddBooks() {
        library.addBook(bookA);
        assertEquals(1, library.stockSize());
    }
}
