package abstract_factory.impl;

import abstract_factory.Company;
import abstract_factory.Gpu;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }
}
