## Scenario

### Problem

Let us imagine a car class. To create a simple car, we need details like the brand, model, color, number of doors, screen specifications, weight, and height. A unique identifier and other specifications might also be necessary. The initialization of these fields often leads to a complicated constructor with many parameters, or they can be scattered in the client code. We may not need all fields for every object, making calls to the constructor messy. Creating multiple overloaded constructors can also result in too many unnecessary constructors in the code.

### Solution

The builder pattern helps separate the code for creating an object from its class by using builder objects. These builders will have the same fields as the car class, with methods that don’t start with a setter prefix, and a build method that creates an instance of the object. This build method uses a large constructor in the car class, which should not be public. The constructor's access should be package-private if the builder is outside the class, and private if it is an inner class, limiting access and ensuring that instances must be created using the builder instead of the constructor.  

