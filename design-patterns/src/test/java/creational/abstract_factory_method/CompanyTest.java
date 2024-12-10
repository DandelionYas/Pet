package creational.abstract_factory_method;

import creational.abstract_factory.Company;
import creational.abstract_factory.Gpu;
import creational.abstract_factory.Monitor;
import creational.abstract_factory.companies.AsusManufacturer;
import creational.abstract_factory.companies.MsiManufacturer;
import creational.abstract_factory.products.AsusGpu;
import creational.abstract_factory.products.AsusMonitor;
import creational.abstract_factory.products.MsiGpu;
import creational.abstract_factory.products.MsiMonitor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompanyTest {

    @Test
    public void testCompany() {
        Company msi = new MsiManufacturer();
        Gpu msiGpu = msi.createGpu();
        Monitor msiMonitor = msi.createMonitor();
        Assertions.assertInstanceOf(MsiGpu.class, msiGpu);
        Assertions.assertInstanceOf(MsiMonitor.class, msiMonitor);

        Company asus = new AsusManufacturer();
        Gpu asusGpu = asus.createGpu();
        Monitor asusMonitor = asus.createMonitor();
        Assertions.assertInstanceOf(AsusGpu.class, asusGpu);
        Assertions.assertInstanceOf(AsusMonitor.class, asusMonitor);
    }
}
