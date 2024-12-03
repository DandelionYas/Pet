package builder;

import builder.builders.CarBuilder;

public interface Builder {
    Builder make(String make);
    Builder model(String model);
    Builder color(String color);
    Builder year(int year);
}
