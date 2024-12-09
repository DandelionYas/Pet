package structural.facade.third_party_library.impl;

import structural.facade.third_party_library.CryptoService;
import structural.facade.third_party_library.User;

public class BitcoinService extends CryptoService {
    @Override
    public void buyCurrency(User user, double currency) {
        // Buy Bitcoin
    }
}
