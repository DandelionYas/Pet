package creational.prototype.vehicles;

import creational.prototype.Vehicle;

public class Bus extends Vehicle {
    private int doors;

    public Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }
}
