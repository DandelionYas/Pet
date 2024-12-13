package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.handlers.RuleCheckHandler;
import behavioral.chain_of_responsibility.handlers.UserExistsHandler;
import behavioral.chain_of_responsibility.handlers.ValidPasswordHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthenticationTest {

    @Test
    public void testAuthentication() {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RuleCheckHandler());
        AuthService authService = new AuthService(handler);
        Assertions.assertTrue(authService.login("admin", "admin_password"));
        Assertions.assertThrows(RuntimeException.class, () -> authService.login("Yaser", "wrong_password"));
    }
}
