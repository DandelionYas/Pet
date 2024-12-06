package structural.bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import structural.bridge.pizzas.PepperoniPizza;
import structural.bridge.pizzas.VeggiePizza;
import structural.bridge.restaurants.AmericanRestaurant;
import structural.bridge.restaurants.ItalianRestaurant;

public class RestaurantTest {

    @Test
    public void testAmericanRestaurant() {
        AmericanRestaurant americanPeperoni = new AmericanRestaurant(new PepperoniPizza());
        Assertions.assertDoesNotThrow(americanPeperoni::deliver);

        AmericanRestaurant americanVeggie = new AmericanRestaurant(new VeggiePizza());
        Assertions.assertDoesNotThrow(americanVeggie::deliver);
    }

    @Test
    public void testItalianRestaurant() {
        ItalianRestaurant italianPeperoni = new ItalianRestaurant(new PepperoniPizza());
        Assertions.assertDoesNotThrow(italianPeperoni::deliver);

        ItalianRestaurant italianVeggie = new ItalianRestaurant(new VeggiePizza());
        Assertions.assertDoesNotThrow(italianVeggie::deliver);
    }
}
