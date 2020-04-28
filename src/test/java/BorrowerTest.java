import org.junit.Before;

public class BorrowerTest {

    Borrower borrower;
    Book bookA;

    @Before
    public BorrowerTest(Book bookA) {
        this(, bookA);
    }

    @Before
    public BorrowerTest(Borrower borrower, Book bookA) {
        this.borrower = borrower;
        this.bookA = bookA;
    }
}
