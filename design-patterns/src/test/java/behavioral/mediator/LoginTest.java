package behavioral.mediator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginTest {

    @Test
    public void testLogin() {
        Dialog dialog = new Dialog();
        dialog.setUserTextBox(new TextArea("UserName"));
        dialog.setPasswordTextBox(new TextArea("Password"));
        LoginButton loginButton = new LoginButton(dialog);
        Assertions.assertDoesNotThrow(() -> loginButton.fireActionPerformed(new ActionEvent(loginButton, 0, "")));
    }
}
