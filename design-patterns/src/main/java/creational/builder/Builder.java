package creational.builder;

public interface Builder {
    Builder make(String make);
    Builder model(String model);
    Builder color(String color);
    Builder year(int year);
}
