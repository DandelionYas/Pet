package chain_of_responsibility;

public class AuthService {
    private final Handler loginHandler;

    public AuthService(Handler loginHandler) {
        this.loginHandler = loginHandler;
    }

    public boolean login(String username, String password) {
        if (loginHandler.handle(username, password)) {
            System.out.println("User Logged in as " + username);
            // Do stuff for authorized users

            return true;
        }
        return false;
    }
}
