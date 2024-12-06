## Scenario

### Problem

Say you have a pizza delivery business.  To represent and implement the different transactions you offer, you went with a Pizza class along with a pair of subclasses: the PepperoniPizza and the VeggiePizza.  Now your pizza business has boomed, and you found the need to extend this class hierarchy to incorporate both the American and the Italian way of preparing pizzas.  So, you plan to create American and Italian pizza sub-classes. However, since you already have two sub-classes, you'll need to create four class combinations, such as AmericanPepperoniPizza, and ItalianVeggiePizza and so on... adding new pizza types and ways of preparing these pizzas to the hierarchy will grow it exponentially.

For example, to add a chicken pizza, you'd need to introduce two new sub-classes, one for each way of preparing it. The further we go, This worse it becomes... This problem occurs because we're trying to extend the pizza class into two, independent dimensions:, by the type of the pizza, and by way we are preparing the pizza that's a very common issue with using class inheritance.

### Solution

One way to fix this problem is to switch from inheritance to composition. What this means is you extract one of the dimensions into a separate class hierarchy so that the original classes will reference an object of the new hierarchy instead of having all of its state and behaviors within one class, following this approach we can extract the method of preparation related to code into its own class. Let's name it. Restaurant with two subclasses AmericanRestaurant and ItalianRestaurant.  A pizza object can now be added as an attribute inside this newly created class. The reference we just added will act as a bridge between the pizza and restaurant classes from now on. Adding new pizzas won't require changing the restaurant hierarchy and vice versa.  Now, when the user wants to call the delivery method, all they have to do is provide the type of pizza they want for the restaurant they wish and that's it! On top of this, they now have the flexibility to easily switch between pizza types as well as restaurant types at runtime.  
The two hierarchies in Gang of Four book are refer to as Abstraction and Implementation respectively. 
 - Abstraction: is the main interface which acts as the root of main hierarchy
 - Implementation: is the root of the second hierarchy which shows different ways of implementing behavior 

