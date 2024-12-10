package creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void testSingleton() {
        Singleton object1 = Singleton.getInstance("Sample data");
        Singleton object2 = Singleton.getInstance("Sample data");
        Assertions.assertEquals(object1, object2);
    }
}
