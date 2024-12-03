package creational.factory_method;

import creational.factory_method.resturants.BeefBurgerRestaurant;
import creational.factory_method.resturants.VeggieBurgerRestaurant;

public class Client {
    public static void main(String[] args) {
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        Burger beefBurger = beefRestaurant.orderBurger();

        Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
        Burger veggieBerger = veggieRestaurant.orderBurger();
    }
}
