package structural.decorator;

import java.util.Random;

public class DatabaseService {

    public String getMailFormUsername(String username) {
        return username.toLowerCase() + "@mail.com";
    }

    public String getPhoneNumberForUsername(String username) {
        System.out.println("Getting phone number for " + username);
        return String.valueOf(new Random().nextInt(1_000_000,10_000_000));
    }
}
