## Scenario

### Problem

Suppose we are developing a notification service for our food delivery app that informs customers about important events like deliveries and order confirmations. The first version included a notifier class with a send method to email notifications based on a username. Customers now want more options, like WhatsApp and Facebook notifications. To address this, we created two new subclasses: WhatsappNotifier and FacebookNotifier. However, a customer asked to receive notifications via both WhatsApp and Facebook at the same time. This would require creating a new class for dual notifications, which complicates the code. Adding more options, like SMS, makes the number of subclasses difficult to manage.

### Solution

The problem can be solved using the Decorator Design Pattern. This pattern allows new behaviors to be added to an object by placing it inside a wrapper object that contains those behaviors. For our example, we will keep the main Notifier class unchanged. The FacebookNotifier and WhatsAppNotifier classes will be renamed to FacebookDecorator and WhatsAppDecorator, extending a new BaseNotifierDecorator class, which serves as the wrapper for the initial notifier. All these classes will implement the same interface, called INotifier, which will be used throughout our applications and by the wrapper class.

This approach allows us to replace inheritance with composition. Composition enables easy substitution of objects since they all share the same interface, allowing for behavior changes at runtime. An object can utilize multiple behaviors from various classes, not just one. Consequently, our code will function seamlessly with either the original notifier or the decorated versions, as all decorators adhere to the same interface as the base Notifier class. 

