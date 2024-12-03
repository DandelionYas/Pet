package chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private final Map<String, String> users;

    public Database() {
        this.users = new HashMap<>();
        users.put("Admin", "admin_password");
        users.put("Jane", "jane_password");
    }

    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        return users.get(username).equals(password);
    }
}
