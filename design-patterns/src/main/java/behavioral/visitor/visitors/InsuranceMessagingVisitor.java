package behavioral.visitor.visitors;

import behavioral.visitor.Client;
import behavioral.visitor.Visitor;
import behavioral.visitor.clients.Bank;
import behavioral.visitor.clients.Company;
import behavioral.visitor.clients.Resident;
import behavioral.visitor.clients.Restaurant;

import java.util.List;

public class InsuranceMessagingVisitor implements Visitor {

    public boolean sendInsuranceMails(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
        return true;
    }

    @Override
    public void visitBank(Bank bank) {
        System.out.println("Sending theft insurance mails.");
    }

    @Override
    public void visitCompany(Company company) {
        System.out.println("Sending employees and equipment insurance mails.");
    }

    @Override
    public void visitResident(Resident resident) {
        System.out.println("Sending medical insurance mails.");
    }

    @Override
    public void visitRestaurant(Restaurant restaurant) {
        System.out.println("Sending fire and food insurance mails.");
    }
}
