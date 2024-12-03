package behavioral.chain_of_responsibility.handlers;

import behavioral.chain_of_responsibility.Handler;

public class RuleCheckHandler extends Handler {
    @Override
    public boolean handle(String username, String password) {
        // Do the custom rule check
        System.out.println("Authentication successful");
        return true;
    }
}
