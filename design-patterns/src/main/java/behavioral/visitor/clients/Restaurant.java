package behavioral.visitor.clients;

import behavioral.visitor.Client;
import behavioral.visitor.Visitor;

public class Restaurant extends Client {

    public Restaurant(String name, String address, String phone) {
        super(name, address, phone);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRestaurant(this);
    }
}
