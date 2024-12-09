package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Book> books = new ArrayList<>();

    public void storeBook(String name, double price, String type, String publisher, String otherData) {
        BookType bookType = BookFactory.getBookType(type, publisher, otherData);
        books.add(new Book(name, price, bookType));
    }

    public void displayBooks() {
        for (Book book : books) {
            //render the books on the store website
            System.out.println(book);
        }
    }
}
