package creational.prototype;

import creational.prototype.vehicles.Bus;
import creational.prototype.vehicles.Car;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class VehicleRegistryTest {

    @Test
    public void testVehicleRegistry() {
        Car car = new Car("Bugatti", "V8", "Black", 300);
        Bus bus = new Bus("Benz", "V6", "White", 150);
        VehicleRegistry vehicleRegistry = new VehicleRegistry();
        List<Vehicle> cloned = vehicleRegistry.clone(List.of(car, bus));
        cloned.forEach(v -> {
            if (v instanceof Car clonedCar) {
                // Data is the same
                assertThat(clonedCar.getMake()).isEqualTo(car.getMake());
                assertThat(clonedCar.getModel()).isEqualTo(car.getModel());
                assertThat(clonedCar.getColor()).isEqualTo(car.getColor());
                assertThat(clonedCar.getTopSpeed()).isEqualTo(car.getTopSpeed());
                // Objects are different
                assertThat(clonedCar == car).isFalse();
            } else if (v instanceof Bus clonedBus) {
                // Data is the same
                assertThat(clonedBus.getMake()).isEqualTo(bus.getMake());
                assertThat(clonedBus.getModel()).isEqualTo(bus.getModel());
                assertThat(clonedBus.getColor()).isEqualTo(bus.getColor());
                assertThat(clonedBus.getDoors()).isEqualTo(bus.getDoors());
                // Objects are different
                assertThat(clonedBus == bus).isFalse();
            }
        });
    }
}
