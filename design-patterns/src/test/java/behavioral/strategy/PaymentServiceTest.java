package behavioral.strategy;

import behavioral.strategy.strategies.PaymentByCreditCard;
import behavioral.strategy.strategies.PaymentByPayPal;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentServiceTest {

    @Test
    public void testPaymentByCreditCard() {
        PaymentService paymentService = new PaymentService();
        paymentService.setCost(1000);
        paymentService.setPaymentStrategy(new PaymentByCreditCard());
        boolean paid = paymentService.pay();
        Assertions.assertThat(paid).isTrue();
    }

    @Test
    public void testPaymentByPayPal() {
        PaymentService paymentService = new PaymentService();
        paymentService.setIncludeDelivery(true);
        paymentService.setCost(1000);
        paymentService.setPaymentStrategy(new PaymentByPayPal());
        boolean paid = paymentService.pay();
        Assertions.assertThat(paid).isTrue();
    }
}
