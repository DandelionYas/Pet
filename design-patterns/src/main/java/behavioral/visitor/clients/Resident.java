package behavioral.visitor.clients;

import behavioral.visitor.Client;
import behavioral.visitor.Visitor;

public class Resident extends Client {

    public Resident(String name, String address, String phone) {
        super(name, address, phone);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitResident(this);
    }
}
