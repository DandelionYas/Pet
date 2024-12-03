package behavioral.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginButton extends Component {
    // Decouples Button from TextBoxes
    private Mediator mediator;

    public LoginButton(Dialog dialog) {
        this.mediator = dialog;
    }

    void fireActionPerformed(ActionEvent e) {
        mediator.login();
    }
}
