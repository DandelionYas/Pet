## Outline

### Problem

The restaurant application allows you to order food online and eventually pay for the food you bought. Okay, the payment is to be made using credit card, so the first thing we need to do is take the card details from the customer, then we have to validate the information this user has provided and, finally, we have to actually proceed with the payment.  However, problems may arise if you try to add to this currently working piece of code several payment methods, like PayPal, for example.  In this case, you will need to wrap your current code with an if-statement or switch case and then introduce the new payment method alongside all its required working logic.  Now, while this may seem an appropriate solution for the short term, it would be a block of code that is closed for extension and open for modification because every time a change is required we are going to have to open this method and modify it and that is obviously not what is stated by the open-closed principle we all know.  Additionally, this class handles several functionalities. So far in this example, it handles both payments by credit card and through PayPal and that contradicts the single responsibility principle as well.

### Solution

To fix this, what we need is a kind of strategy that places each payment method in its own class, making this class responsible for a particular payment method and those classes we create should be easily interchangeable or replaceable by one another. One way to do this is to apply the Strategy Design Pattern. The strategy pattern is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable. 

