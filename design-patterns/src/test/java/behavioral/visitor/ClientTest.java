package behavioral.visitor;

import behavioral.visitor.clients.Bank;
import behavioral.visitor.clients.Company;
import behavioral.visitor.clients.Resident;
import behavioral.visitor.clients.Restaurant;
import behavioral.visitor.visitors.InsuranceMessagingVisitor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

    @Test
    public void testInsuranceEmailSender() {
        InsuranceMessagingVisitor insuranceVisitor = new InsuranceMessagingVisitor();
        List<Client> clients = new ArrayList<>();
        clients.add(new Bank("Bank Meli", "Tehran", "0215645328"));
        clients.add(new Company("Saddad", "Tehran", "0215632131"));
        clients.add(new Resident("Ali", "Tehran", "0215632165"));
        clients.add(new Restaurant("Markazi", "Tehran", "0215642428"));

        Assertions.assertTrue(insuranceVisitor.sendInsuranceMails(clients));
    }
}
