package creational.abstract_factory.companies;

import creational.abstract_factory.Company;
import creational.abstract_factory.Gpu;
import creational.abstract_factory.Monitor;
import creational.abstract_factory.products.AsusGpu;
import creational.abstract_factory.products.AsusMonitor;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
