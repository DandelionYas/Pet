package structural.bridge;

public abstract class Restaurant {
    protected Pizza pizza;

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    protected abstract void addSauce();
    protected abstract void addTopping();
    protected abstract void makeCrust();

    public void deliver() {
        makeCrust();
        addSauce();
        addTopping();
        pizza.prepare();
        pizza.qualityCheck();
        System.out.println("Order in progress!");
    }
}
