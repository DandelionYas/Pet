package factory_method;

import factory_method.resturants.BeefBurgerRestaurant;
import factory_method.resturants.VeggieBurgerRestaurant;

public class Client {
    public static void main(String[] args) {
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        Burger beefBurger = beefRestaurant.orderBurger();

        Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
        Burger veggieBerger = veggieRestaurant.orderBurger();
    }
}
