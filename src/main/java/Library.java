import java.util.ArrayList;

public class Library<book> {

    private ArrayList Stock;
    private int capacity;

    public Library() {
        this.Stock = new ArrayList();
        this.capacity = 6;
    }

    public int stockSize() {
        return this.Stock.size();
    }

    public void addBook(book book) {
        if (this.capacity > this.stockSize()) {
            this.Stock.add(book);
        }
    }
}