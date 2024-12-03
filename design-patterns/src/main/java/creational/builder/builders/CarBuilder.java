package creational.builder.builders;

import creational.builder.Builder;

public class CarBuilder implements Builder {
    private int id;
    private String make;
    private String model;
    private String color;
    private int year;

    public CarBuilder(int id) {
        this.id = id;
    }

    public CarBuilder make(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder year(int year) {
        this.year = year;
        return this;
    }

    public Car build() {
        return new Car(id, make, model, color, year);
    }
}
