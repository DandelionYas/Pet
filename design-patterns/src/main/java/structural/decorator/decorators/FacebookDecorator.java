package structural.decorator.decorators;

import structural.decorator.INotifier;

public class FacebookDecorator extends BaseNotifierDecorator {

    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        // Supports the previous functionality
        super.send(message);
        // Adding new functionality
        String mailAddress = databaseService.getMailFormUsername(getUsername());
        System.out.println("Sending " + message + " by Facebook on " +  mailAddress);
    }
}
