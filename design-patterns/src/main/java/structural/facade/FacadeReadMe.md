## Scenario

### Problem

If you are in the cryptocurrency business creating an investing app, this app will let clients buy, sell, and store cryptocurrency using their local currency. You have a complex third-party library and a few classes that you want to reuse. This library has various options and methods, and you want to reuse the buyCurrency method.

You can directly call this method after getting required parameters. However, the problem is if other parts of the app need this code, duplicating it may be necessary. Changes in requirements, such as checking the account balance or sending an email after a transaction, would mean modifying every instance of the code. This creates a situation where the business logic is tightly linked to the implementation details of the library, making it hard to maintain. Therefore, you need a centralized location for the logic to avoid direct access to the library and allow reuse across the app.

### Solution

The Façade is the central place clients access and work with. It provides a simplified interface for the complex processes happening in the background, which is the main idea of the Façade pattern. 

