package abstract_factory;

public abstract class Company {
    public Gpu assembleGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    // Now the Company wants to produce Monitors
    // if we want to keep following Factory Method Pattern, we should have the following method:
    // public abstract Component(String type); type => Gpu, Monitor
    // But it would violate the Open Closed Principle
    public abstract Gpu createGpu();

    // This is Abstract Factory Design Pattern:
    // Adding abstract factory methods for each product
    // making sure to follow Open Closed Principle
    public abstract Monitor createMonitor();
}
