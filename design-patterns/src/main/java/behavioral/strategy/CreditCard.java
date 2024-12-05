package behavioral.strategy;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CreditCard {
    private int cardNumber;
    private LocalDate expirationDate;
    private String cvv;
    private int balance;

    public CreditCard(int cardNumber, LocalDate expirationDate, String cvv) {

    }
}
