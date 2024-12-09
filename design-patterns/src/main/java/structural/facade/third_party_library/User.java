package structural.facade.third_party_library;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private double balance;
    private String currency;
    private String accountNumber;
}
