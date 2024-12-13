package behavioral.observer;

import behavioral.observer.listeners.EmailMsgListener;
import behavioral.observer.listeners.MobileAppListener;
import org.junit.jupiter.api.Test;

public class StoreNotificationTest {

    @Test
    public void testStoreNotification() {
        NotificationService notificationService = new NotificationService();
        notificationService.subscribe(Event.SALE, new EmailMsgListener("New message: "));
        notificationService.subscribe(Event.NEW_ITEM, new MobileAppListener("New message: "));
        new Store(notificationService).newItemPromotion();
    }
}
