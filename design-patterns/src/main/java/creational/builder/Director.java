package creational.builder;

/**
 * If the objects are being initialized in different parts of application are being repeated,
 * You can have a Director class to prevent duplicate builder code across the application
 */
public class Director {

    public void buildBugatti(Builder carBuilder) {
        carBuilder.make("Bugatti")
                .model("8L")
                .color("Black")
                .year(2024);
    }

    public void buildLamborghini(Builder carBuilder) {
        carBuilder.make("Lamborghini")
                .model("6L")
                .color("Red")
                .year(2024);
    }
}
