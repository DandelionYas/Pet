package behavioral.observer;

import behavioral.observer.listeners.EmailMsgListener;
import behavioral.observer.listeners.MobileAppListener;

import java.util.Arrays;

public class Store {
    private final NotificationService notificationService;

    public Store(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void newItemPromotion() {
        Arrays.stream(Event.values()).forEach(notificationService::notifyCustomers);
    }

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.subscribe(Event.SALE, new EmailMsgListener("New message: "));
        notificationService.subscribe(Event.NEW_ITEM, new MobileAppListener("New message: "));
        new Store(notificationService).newItemPromotion();
    }
}
