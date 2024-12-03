package creational.abstract_factory;

import creational.abstract_factory.companies.AsusManufacturer;
import creational.abstract_factory.companies.MsiManufacturer;

public class Client {
    public static void main(String[] args) {
        Company msi = new MsiManufacturer();
        Gpu msiGpu = msi.createGpu();
        Monitor msiMonitor = msi.createMonitor();

        Company asus = new AsusManufacturer();
        Gpu asusGpu = asus.createGpu();
        Monitor asusMonitor = msi.createMonitor();
    }
}
