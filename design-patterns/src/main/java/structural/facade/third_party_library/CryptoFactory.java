package structural.facade.third_party_library;

import structural.facade.third_party_library.impl.BitcoinService;
import structural.facade.third_party_library.impl.EthereumService;

public class CryptoFactory {
    public static CryptoService getCryptoService(String currency) {
        if (currency.equals("BTC")) {
            return new BitcoinService();
        } else if (currency.equals("ETH")) {
            return new EthereumService();
        }
        // other currency and services
        return new EthereumService();
    }
}
