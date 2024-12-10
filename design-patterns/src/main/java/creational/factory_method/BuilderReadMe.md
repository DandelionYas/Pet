## Scenario

### Problem

Imagine you own a burger restaurant and developed an app to deliver burgers. Each burger type is represented by a class extending a base class for burgers. When a customer makes an order, a single class named "Restaurant" identifies which burger to prepare, creates an object of that burger type, and delivers it. Although the application seems complete, adding new recipes or products in the future would require changing the code inside the single class "Restaurant", violating open-closed and single-responsibility principles.

### Solution

To make future changes easier, we encapsulate the burger creation code in a separate class called a Factory. This approach maintains better flexibility for the app as the menu changes. A factory is used because it focuses solely on creating burgers. When we want to order from our restaurant, we call a method and pass the burger type, which returns the order that follows the Burger class. All related code is organized in one place, separate from the rest of the restaurant code. This is called **Simple Factory Pattern**. It follows single responsibility principle but still violating open-closed principle. 

To follow both principles we go back to the "Restaurant" class and add an abstract method for creating burgers returning objects of base class burger. This method will be implemented by child classes of restaurant which should be created for each type of burgers: BeefBurgerRestaurant and VeggieBurgerRestaurant. This way for any changes in future we need to add or remove Restaurant subclasses. This design is called **Factory Method** and code will be open for extension and closed for modification. 

