package abstract_factory.companies;

import abstract_factory.Company;
import abstract_factory.Gpu;
import abstract_factory.Monitor;
import abstract_factory.products.MsiGpu;
import abstract_factory.products.MsiMonitor;

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
