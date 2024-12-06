package structural.composite;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import structural.composite.tree.Book;
import structural.composite.tree.CompositeBox;
import structural.composite.tree.VideoGame;

public class DeliveryServiceTest {

    @Test
    public void testDeliveryService() {
        DeliveryService deliveryService = new DeliveryService();

        deliveryService.setupOrder(
                new CompositeBox(
                        new VideoGame("1", 100)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("2", 200),
                                new Book("3", 300)
                        ),
                        new VideoGame("4", 400),
                        new VideoGame("5", 500)
                )
        );

        Assertions.assertThat(deliveryService.calculateOrderCost()).isEqualTo(1500);
    }
}
