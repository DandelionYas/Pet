package structural.bridge.pizzas;

import structural.bridge.Pizza;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Adding Sauce:" + sauce);
        System.out.println("Adding Topping:" + topping);
        System.out.println("Adding Cheese...");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Quality check passed!");
    }
}
