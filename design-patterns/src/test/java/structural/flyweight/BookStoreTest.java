package structural.flyweight;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookStoreTest {
    private static final int BOOK_TYPES = 2;
    private static final int BOOKS_TO_INSERT = 10_000; // 10_000_000

    @Test
    public void testBookStore() {
        Store store = new Store();
        for (int i = 0; i < BOOKS_TO_INSERT/BOOK_TYPES; i++) {
            store.storeBook(getRandomName(), getRandomPrice(), "Action", "Follett", "Stuff");
            store.storeBook(getRandomName(), getRandomPrice(), "Fantasy", "Ingram", "Extra");
        }
        store.displayBooks();
        // Optimisation: We have only two book types for 10_000 records
        Assertions.assertThat(BookFactory.getBookTypeCount()).isEqualTo(BOOK_TYPES);
    }

    private String getRandomName() {
        return RandomStringUtils.secure().next(10);
    }

    private double getRandomPrice() {
        return RandomUtils.secure().randomDouble(100, 2000);
    }
}
