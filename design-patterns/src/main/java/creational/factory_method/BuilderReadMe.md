## Scenario

### Problem

Imagine you own a burger restaurant and developed an app to deliver burgers. Each burger type is represented by a class in the app's code. When a customer makes an order, the app identifies which burger to prepare, creates an object of that burger type, and delivers it. However, there is a limitation: the BeefBurger and VeggieBurger objects are different and the code can only return one type of object. Without a common base class or interface, this approach won't work.

To solve this, we create a base class for burgers. This class will help to combine both burger types and share common behaviors. Although the application seems complete, adding new recipes or products in the future would require changing the code, violating key design principles. This might lead to duplicating code in various places.

As the restaurant evolves, it will keep adding or removing items from the menu. For example, if we remove the veggie burger and add a chicken burger, we must adjust the code accordingly. To make future changes easier, we encapsulate the burger creation code in a separate class called a Factory. This approach maintains better flexibility for the app as the menu changes.

### Solution

A factory is used because it focuses solely on creating burgers. When we want to order from our restaurant, we call a method and pass the burger type, which returns the order that follows the Burger class. All related code is organized in one place, separate from the rest of the restaurant code. To connect this back to our main method, we create a factory object and pass it the type to get our food ready. Our orderBurger method does not need to worry about specific burger types since they all implement the Burger interface. This design is called the Simple Factory Idiom. It includes the Restaurant class as the client, the factory knowing concrete burger types, and concrete burger products. This idiom is the first step towards understanding the Factory Method Design Pattern, which separates product creation from usage.  

