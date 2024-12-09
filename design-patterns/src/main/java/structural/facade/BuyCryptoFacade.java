package structural.facade;

import structural.facade.third_party_library.*;

public class BuyCryptoFacade {
    public boolean buyCryptocurrency(double amount, String currency) {
        DatabaseService db = new DatabaseService();
        User user = db.getUser(UIService.getLoggedInUserId());
        if (user.getBalance() < amount) {
            System.out.println("Insufficient balance to perform transaction");
            return false;
        }

        CryptoFactory.getCryptoService(currency).buyCurrency(user, amount);
        MailService mailService = new MailService();
        mailService.sendConfirmationMail();
        return true;
    }
}
