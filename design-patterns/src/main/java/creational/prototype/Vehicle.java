package creational.prototype;

public abstract class Vehicle {
    private String make;
    private String model;
    private String color;
    public Vehicle(Vehicle vehicle) {
        this.make = vehicle.make;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public abstract Vehicle clone();
}
