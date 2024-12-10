## Scenario

### Problem

A country has only one official president, which serves as a global identifier. Similarly, in software design, controlling how many instances a class has is important. For example, a database only needs one instance for the entire application. Instead of making new instances, a single database instance should be reused for accessing tables.

### Solution

Singletons Design Pattern lets you create one instance of the class and access your object from anywhere in your application. It encapsulates the attributes of class and guarantee that only one instance of this class will be available at any point in time.
