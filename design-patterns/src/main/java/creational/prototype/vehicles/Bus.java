package creational.prototype.vehicles;

import creational.prototype.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bus extends Vehicle {
    private int doors;

    public Bus(String make, String model, String color, int doors) {
        super(make, model, color);
        this.doors = doors;
    }

    public Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }
}
