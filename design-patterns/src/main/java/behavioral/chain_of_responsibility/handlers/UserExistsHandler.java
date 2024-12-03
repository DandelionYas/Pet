package behavioral.chain_of_responsibility.handlers;

import behavioral.chain_of_responsibility.Database;
import behavioral.chain_of_responsibility.Handler;

public class UserExistsHandler extends Handler {
    private final Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.println(username + " is not a valid username");
            return false;
        }

        return handleNext(username, password);
    }
}
