package chain_of_responsibility.handlers;

import chain_of_responsibility.Database;
import chain_of_responsibility.Handler;

public class ValidPasswordHandler extends Handler {
    private final Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("Invalid password");
            return false;
        }

        return handleNext(username, password);
    }
}
