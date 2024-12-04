package behavioral.observer.listeners;

import behavioral.observer.Event;
import behavioral.observer.EventListener;

public class EmailMsgListener implements EventListener {
    private final String message;

    public EmailMsgListener(String message) {
        this.message = message;
    }

    public void update(Event event) {
        System.out.println(message + event);
    }
}
