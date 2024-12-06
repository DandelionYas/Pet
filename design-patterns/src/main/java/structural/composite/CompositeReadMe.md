## Scenario

### Problem

Imagine you run an Amazon delivery system with two types of items: order boxes and products. A box can hold several products and smaller boxes, which can also contain more products or smaller boxes. The goal is to calculate the total price of all products in the main box. One way is to unpack everything and tally the items, but this isn't simple or efficient in a program. Solutions can become complicated if we need to add costs, introduce new product types, or add items to the main box. These factors make it hard to create a flexible and effective method since many details must be known ahead of time.

### Solution

The solution to these problems resides in applying the Composite Design Pattern.  The composite pattern is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.  You see, using the composite pattern makes sense only when the model and object structures, of our application can be represented as a tree and if you take a look at representation of this example, you will see that, well, it really is very similar to a tree structure. 

