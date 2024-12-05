package behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Client {
    private final String name;
    private final String address;
    private final String phone;

    public abstract void accept(Visitor visitor);
}