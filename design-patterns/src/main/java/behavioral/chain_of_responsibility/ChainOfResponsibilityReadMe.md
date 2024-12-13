## Scenario

### Problem

Imagine you are relaxing on Netflix when a text says your credit card is suspended. You call the bank, and a robotic voice asks your language preference. After wasting time, you finally speak to a live operator who doesn't understand your issue. Eventually, you get connected to the right person and resolve your problem. This experience shows how requests are passed between operators. Each operator only handles one specific task. If they cannot resolve your issue, they will transfer you to the next operator. Any operator can also choose not to pass your request, halting further action.

### Solution

This example and many others are perfect real-life analogies to the Chain of Responsibility Design Pattern. This pattern is a behavioral design pattern that lets you transform particular behaviors into standalone objects called handlers, then upon receiving a request, this request will pass along the chain of handlers where each one can decide either to process the request or pass it to the next handler in the chain.  