package structural.decorator.decorators;

import structural.decorator.INotifier;

public class WhatsAppDecorator extends BaseNotifierDecorator {

    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        // Supports the previous functionality
        super.send(message);
        // Adding new functionality
        String phoneNumber = databaseService.getPhoneNumberForUsername(getUsername());
        System.out.println("Sending " + message + " by WhatsApp on " +  phoneNumber);
    }
}
