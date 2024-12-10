package creational.factory_method;

import creational.factory_method.products.BeefBurger;
import creational.factory_method.products.VeggieBurger;
import creational.factory_method.resturants.BeefBurgerRestaurant;
import creational.factory_method.resturants.VeggieBurgerRestaurant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestaurantTest {

    @Test
    public void testRestaurant() {
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        Burger beefBurger = beefRestaurant.orderBurger();
        Assertions.assertInstanceOf(BeefBurger.class, beefBurger);

        Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
        Burger veggieBerger = veggieRestaurant.orderBurger();
        Assertions.assertInstanceOf(VeggieBurger.class, veggieBerger);
    }
}
