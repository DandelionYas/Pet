## Scenario

### Problem

You are developing a smart home automation app that lets users control the lights in different rooms. Each room is made into a class that extends a base Room class, which holds common code, including the Light class since you need lights in every room. The Room class will contain the ability to turn lights on or off. Clients can select which room’s lights to control. The code is organized well and adheres to the open-closed principle, so adding features later won't disrupt the existing application.

However, there are significant flaws with this approach. Having many subclasses can lead to problems if the light logic in the Room class is changed, as it may break the subclasses. For instance, if the owner has sensors in the bathrooms, they might not need the app to control those lights, but the current design does not allow removing that feature for specific rooms.

Moreover, the app should also control lights that are not in rooms, like a floor lamp, which can’t be linked to the Room class. This would lead to duplicate light logic in the FloorLamp class. To fix this, the light switching logic should be moved to the Light class itself, maintaining a clean separation of business logic from the rest of the code. Still, there are multiple classes calling this logic, violating the single responsibility principle.
### Solution

To solve this, you need to extract all request details like the object being called, the method name, and the list of arguments into a separate class with one method to trigger this request. The Command Design Pattern is a behavioral pattern that turns a request or behavior into a stand-alone object containing all information needed to perform an action or trigger an event. 