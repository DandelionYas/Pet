package abstract_factory.companies;

import abstract_factory.Company;
import abstract_factory.Gpu;
import abstract_factory.Monitor;
import abstract_factory.products.AsusGpu;
import abstract_factory.products.AsusMonitor;

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
