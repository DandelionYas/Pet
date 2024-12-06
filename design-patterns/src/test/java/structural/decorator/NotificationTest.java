package structural.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import structural.decorator.decorators.FacebookDecorator;
import structural.decorator.decorators.WhatsAppDecorator;

public class NotificationTest {

    @Test
    public void testNotification() {
        INotifier notifier = new FacebookDecorator(
                new WhatsAppDecorator(
                        new Notifier("yasssser")
                )
        );

        // FacebookDecorator calls super.send() from BaseNotifierDecorator
        // wrapped.send(); => WhatsAppDecorator.send() => in turn calls super.send()
        // wrapper.send(); => Notifier.send() => Sending message through mail
        // Then WhatsAppDecorator sends message through WhatsApp
        // Finally FacebookDecorator sends message through Facebook
        Assertions.assertDoesNotThrow(() -> notifier.send("Hello World!"));
    }
}
