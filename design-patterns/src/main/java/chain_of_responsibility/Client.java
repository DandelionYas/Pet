package chain_of_responsibility;

import chain_of_responsibility.handlers.RuleCheckHandler;
import chain_of_responsibility.handlers.UserExistsHandler;
import chain_of_responsibility.handlers.ValidPasswordHandler;

public class Client {
    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RuleCheckHandler());
        AuthService authService = new AuthService(handler);
        authService.login("Admin", "admin_password");
    }
}
