package builder.builders;

import builder.Builder;

public class CarSchemaBuilder implements Builder {
    private int id;
    private String make;
    private String model;
    private String color;
    private int year;

    public CarSchemaBuilder(int id) {
        this.id = id;
    }

    public CarSchemaBuilder make(String make) {
        this.make = make;
        return this;
    }

    public CarSchemaBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarSchemaBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarSchemaBuilder year(int year) {
        this.year = year;
        return this;
    }

    public Car build() {
        return new Car(id, make, model, color, year);
    }
}
