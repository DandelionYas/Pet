package behavioral.strategy;

import lombok.Setter;

@Setter
public class PaymentService {
    private int cost;
    private boolean includeDelivery;

    private PaymentStrategy paymentStrategy;

    public boolean pay() {
        paymentStrategy.collectPaymentDetails();
        if (!paymentStrategy.validatePaymentDetails()) {
            return false;
        }

        paymentStrategy.pay(getTotalAmount());
        return true;
    }

    private int getTotalAmount() {
        return includeDelivery ? cost + 10 : cost;
    }
}
