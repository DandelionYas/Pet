package structural.bridge.pizzas;

import structural.bridge.Pizza;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Adding Sauce:" + sauce);
        System.out.println("Adding Topping:" + topping);
        System.out.println("Adding Pepper...");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Quality check passed!");
    }
}
