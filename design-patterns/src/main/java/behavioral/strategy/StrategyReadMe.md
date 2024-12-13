## Scenario

### Problem

The restaurant application enables online food ordering and payment using credit cards. First, we collect the customer's card details, validate them, and then proceed with the payment. However, adding other payment methods like PayPal can create problems. This requires wrapping the existing code in an if-statement or switch case, which can make the code difficult to modify later. Also, this class manages multiple functionalities, handling both credit card and PayPal payments, violating the single responsibility principle.

### Solution

To fix this, what we need is a kind of strategy that places each payment method in its own class, making this class responsible for a particular payment method; These classes should be injected to the caller class through a common Interface. The strategy pattern is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable. 

