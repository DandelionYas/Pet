package factory_method.resturants;

import factory_method.Burger;
import factory_method.Restaurant;
import factory_method.products.BeefBurger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
