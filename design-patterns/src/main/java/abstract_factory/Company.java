package abstract_factory;

public abstract class Company {
    public Gpu assembleGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    public abstract Gpu createGpu();
}
