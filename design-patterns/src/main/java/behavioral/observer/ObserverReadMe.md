## Scenario

### Problem

If you own a store and a customer asks about an item that isn't available yet, you can tell them to come back later. The customer has two options: they can check the store every day, which may be pointless if the item is still out of stock, or you could email all customers when new stock arrives. However, this might annoy customers uninterested in those items, so a subscription system is needed where customers can choose what and when to be notified.

### Solution

To design such a system, using the Observer Pattern is ideal. This pattern alerts multiple subscribers about events happening to the object they are observing. In our store-customer example, we need a NotificationService within the Store class. This service will track customers or subscribers wanting email notifications. Listeners will be EmailMessageListener objects with each customer's email. The listener class will have an update method to send emails, and customers can subscribe or unsubscribe from notifications freely.