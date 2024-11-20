package sample.services;


import sample.records.UserRecords.*;

/**
 * UserService is a sample service to illustrate behavior part of data oriented programming
 * Methods are static because we want to use this class without creating any abject out of it
 * This design is taking advantage of Records, Sealed Interface and Pattern matching in enhanced switch expressions
 */
public class UserService {
    private UserService() { }

    public static String getPersonInfo(Person person) {
        // There are only two possibility for switch statement because Person is sealed
        return switch (person) {
            // Pattern matching helps te immediately define variable with the same name but beginning with lowercase
            case User user -> "User: %s (%s)".formatted(user.name(), user.email());
            case Admin admin -> "Admin: %s (%s) with permissions: %s"
                    .formatted(admin.name(), admin.email(), admin.permissions());
        };
    }

    public static Person updateEmail(Person person, String newEmail) {
        // Records are immutable, so we have to create a new one
        return switch (person) {
            case User user -> new User(user.id(), user.name(), newEmail);
            case Admin admin -> new Admin(admin.id(), admin.name(), newEmail, admin.permissions());
        };
    }
}
