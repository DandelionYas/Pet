package structural.composite.tree;

import lombok.Data;
import structural.composite.Box;

@Data
public class Product implements Box {
    protected final String title;
    protected final double price;

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
