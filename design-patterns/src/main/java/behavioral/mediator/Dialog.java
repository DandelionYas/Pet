package behavioral.mediator;

import java.awt.*;

public class Dialog implements Mediator {
    // Classes used here are not for real
    private TextArea userTextBox;
    private TextArea passwordTextBox;
    private LoginButton button;

    @Override
    public void login() {
        String username = userTextBox.getText();
        String password = passwordTextBox.getText();
        // Validate username and password
        // logs in the user or pops error message
    }
}
