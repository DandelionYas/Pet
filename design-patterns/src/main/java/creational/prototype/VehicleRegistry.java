package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class VehicleRegistry {

    // Here is the advantage of prototype design pattern
    // No need to check subclasses
    // We can clone Cars and Buses using super class' clone method
    public List<Vehicle> clone(List<Vehicle> vehicles) {
        List<Vehicle> clonedVehicles = new ArrayList<Vehicle>();
        for (Vehicle vehicle : vehicles) {
            clonedVehicles.add(vehicle.clone());
        }
        return clonedVehicles;
    }
}
