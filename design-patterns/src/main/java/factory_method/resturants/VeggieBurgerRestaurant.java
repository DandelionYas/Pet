package factory_method.resturants;

import factory_method.Burger;
import factory_method.Restaurant;
import factory_method.products.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
