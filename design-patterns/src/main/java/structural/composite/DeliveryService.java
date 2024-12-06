package structural.composite;

import structural.composite.tree.CompositeBox;

public class DeliveryService {
    private Box box;
    public DeliveryService() {
    }

    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }

    public double calculateOrderCost() {
        return box.calculatePrice();
    }
}
