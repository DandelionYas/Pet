package creational.factory_method.resturants;

import creational.factory_method.Burger;
import creational.factory_method.Restaurant;
import creational.factory_method.products.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
