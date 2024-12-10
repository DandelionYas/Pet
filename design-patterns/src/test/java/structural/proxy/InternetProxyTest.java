package structural.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InternetProxyTest {

    @Test
    public void testInternetProxy() {
        Internet internet = new ProxyInternet();
        Assertions.assertDoesNotThrow(() -> internet.connectTo("google.com"));
        Assertions.assertThrows(RuntimeException.class, () -> internet.connectTo("banned.com"));
    }
}
