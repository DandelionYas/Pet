package builder;

import builder.builders.Car;
import builder.builders.CarBuilder;

/**
 * If the objects are being initialized in different parts of application are being repeated,
 * You can have a Director class to prevent duplicate builder code across the application
 */
public class Director {

    public void buildBugatti(CarBuilder carBuilder) {
        carBuilder.make("Gugatti")
                .model("8L")
                .color("Black")
                .year(2024);
    }

    public void buildLamborghini(CarBuilder carBuilder) {
        carBuilder.make("Lamborghini")
                .model("6L")
                .color("Red")
                .year(2024);
    }

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder(0);
        director.buildBugatti(carBuilder);
        Car bugatti = carBuilder.build();
    }
}
