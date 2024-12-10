package creational.prototype.vehicles;

import creational.prototype.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car extends Vehicle {
    private int topSpeed;

    public Car(String make, String model, String color, int topSpeed) {
        super(make, model, color);
        this.topSpeed = topSpeed;
    }

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
