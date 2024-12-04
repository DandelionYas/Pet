package behavioral.observer.listeners;

import behavioral.observer.Event;
import behavioral.observer.EventListener;

public class MobileAppListener implements EventListener {
    private final String message;

    public MobileAppListener(String message) {
        this.message = message;
    }

    public void update(Event eventType) {
        System.out.println(message + eventType);

    }
}
