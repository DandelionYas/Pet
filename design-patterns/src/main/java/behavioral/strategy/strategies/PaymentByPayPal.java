package behavioral.strategy.strategies;

import behavioral.strategy.PaymentStrategy;

public class PaymentByPayPal implements PaymentStrategy {
    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect PayPal mail and password...
        email = "...";
        password = "...";
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate account...
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using PayPal...");
    }
}
