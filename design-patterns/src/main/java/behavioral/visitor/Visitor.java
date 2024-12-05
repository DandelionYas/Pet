package behavioral.visitor;

import behavioral.visitor.clients.Bank;
import behavioral.visitor.clients.Company;
import behavioral.visitor.clients.Resident;
import behavioral.visitor.clients.Restaurant;

public interface Visitor {
    void visitBank(Bank bank);
    void visitCompany(Company company);
    void visitResident(Resident resident);
    void visitRestaurant(Restaurant restaurant);
}
