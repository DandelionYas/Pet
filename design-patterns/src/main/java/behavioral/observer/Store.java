package behavioral.observer;

import java.util.Arrays;

public class Store {
    private final NotificationService notificationService;

    public Store(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void newItemPromotion() {
        Arrays.stream(Event.values()).forEach(notificationService::notifyCustomers);
    }
}
