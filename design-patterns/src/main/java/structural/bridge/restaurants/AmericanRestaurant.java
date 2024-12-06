package structural.bridge.restaurants;

import structural.bridge.Pizza;
import structural.bridge.Restaurant;

public class AmericanRestaurant extends Restaurant {
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected void addSauce() {
        pizza.setSauce("Everything");
    }

    @Override
    protected void addTopping() {
        pizza.setTopping("Super Secret Recipe");
    }

    @Override
    protected void makeCrust() {
        pizza.setCrust("Thick");
    }
}
