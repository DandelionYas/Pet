package creational.factory_method.resturants;

import creational.factory_method.Burger;
import creational.factory_method.Restaurant;
import creational.factory_method.products.BeefBurger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
