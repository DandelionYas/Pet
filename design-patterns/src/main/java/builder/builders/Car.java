package builder.builders;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private int id;
    private String make;
    private String model;
    private String color;
    private int year;

    // To prevent gian constructor from being visible applied package access on this constructor
    Car(int id, String make, String model, String color, int year) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }
}
