package structural.facade.third_party_library;

public class DatabaseService {
    public User getUser(long id) {
        // Retrieve from Database
        User user = new User();
        user.setId(id);
        user.setBalance(2000);
        return user;
    }
}
