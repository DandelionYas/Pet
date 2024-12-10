package creational.builder;

import creational.builder.builders.Car;
import creational.builder.builders.CarBuilder;
import creational.builder.builders.CarSchema;
import creational.builder.builders.CarSchemaBuilder;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DirectorTest {

    @Test
    public void testDirector() {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder(0);
        director.buildBugatti(carBuilder);
        Car bugatti = carBuilder.build();

        CarSchemaBuilder carSchemaBuilder = new CarSchemaBuilder(0);
        director.buildBugatti(carSchemaBuilder);
        CarSchema bugattiSchema = carSchemaBuilder.build();

        Assertions.assertThat(bugatti.getColor()).isEqualTo(bugattiSchema.getColor());
        Assertions.assertThat(bugatti.getModel()).isEqualTo(bugattiSchema.getModel());
        Assertions.assertThat(bugatti.getYear()).isEqualTo(bugattiSchema.getYear());
        Assertions.assertThat(bugatti.getMake()).isEqualTo(bugattiSchema.getMake());
    }
}
