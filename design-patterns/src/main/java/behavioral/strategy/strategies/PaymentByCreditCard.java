package behavioral.strategy.strategies;

import behavioral.strategy.CreditCard;
import behavioral.strategy.PaymentStrategy;

import java.time.LocalDateTime;

public class PaymentByCreditCard implements PaymentStrategy {
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect card details...
        card = new CreditCard(214564641, LocalDateTime.now().plusYears(1).toLocalDate(), "867");
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate Credit Card
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        // Check the available balance
        card.setBalance(card.getBalance() - amount);
    }
}
