package structural.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CryptoAppTest {

    @Test
    public void testBuyCrypto() {
        BuyCryptoFacade facade = new BuyCryptoFacade();
        Assertions.assertTrue(facade.buyCryptocurrency(1000, "BTC"));
        Assertions.assertTrue(facade.buyCryptocurrency(1000, "ETH"));
        Assertions.assertFalse(facade.buyCryptocurrency(3000, "BTC"));
    }
}
