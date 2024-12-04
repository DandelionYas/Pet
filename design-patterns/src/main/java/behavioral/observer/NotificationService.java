package behavioral.observer;

import java.util.*;

public class NotificationService {
    private final Map<Event, List<EventListener>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> customers.put(event, new ArrayList<>()));
    }

    public void subscribe(Event event, EventListener listener) {
        customers.get(event).add(listener);
    }

    public void unsubscribe(Event event, EventListener listener) {
        customers.get(event).remove(listener);
    }

    public void notifyCustomers(Event event) {
        customers.get(event).forEach(listener -> listener.update(event));
    }
}
