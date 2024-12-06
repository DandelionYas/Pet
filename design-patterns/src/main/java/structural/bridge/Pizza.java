package structural.bridge;

import lombok.Data;

@Data
public abstract class Pizza {
    protected String sauce;
    protected String topping;
    protected String crust;

    public abstract void prepare();
    public abstract void qualityCheck();
}
