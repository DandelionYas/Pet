package creational.prototype.vehicles;

import creational.prototype.Vehicle;

public class Car extends Vehicle {
    private int topSpeed;

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
