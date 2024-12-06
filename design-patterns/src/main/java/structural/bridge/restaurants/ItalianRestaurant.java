package structural.bridge.restaurants;

import structural.bridge.Pizza;
import structural.bridge.Restaurant;

public class ItalianRestaurant extends Restaurant {
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void addSauce() {
        pizza.setSauce("Oil");
    }

    @Override
    protected void addTopping() {
        pizza.setTopping(null);
    }

    @Override
    protected void makeCrust() {
        pizza.setCrust("Thin");
    }
}
