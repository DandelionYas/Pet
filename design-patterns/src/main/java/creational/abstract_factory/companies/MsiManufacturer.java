package creational.abstract_factory.companies;

import creational.abstract_factory.Company;
import creational.abstract_factory.Gpu;
import creational.abstract_factory.Monitor;
import creational.abstract_factory.products.MsiGpu;
import creational.abstract_factory.products.MsiMonitor;

public class MsiManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
