## Outline

### Problem

Imagine you're chilling on Netflix minding your own business when suddenly you receive a text message saying that your credit card was suspended in a rush, you call the bank in attempt to fix this and the first thing you hear is a robotic voice asking if English is your preferred language, then after wasting several minutes of your life you get to speak with a live operator who has no idea what you are talking about eventually after a while, and after they connect you with the right person your issue is resolved, what you experienced here, besides stress, is the propagation of your request from one operator to another If at any point in time the operator you are speaking to does not know how to address your problem he or she will transfer you to the next one because it isn't their responsibility to handle the issue you are encountering.  

Now, if you were to represent the scenario as classes and methods in an application, you will notice that the operators you are talking to constitute a chain of handlers where each handler is responsible for one single task. Therefore, the problem encountered will be initially checked by the first handler or operator in this example, and as long as the operators thinks that there is still hope in solving your issue they will keep transferring you to another operator until you reach the last one additionally any handler can decide not to pass the request further down the chain and effectively stop any further processing

### Solution

This example and many others are perfect real-life analogies to the Chain of Responsibility Design Pattern. This pattern is a behavioral design pattern that lets you transform particular behaviors into standalone objects called handlers, then upon receiving a request, this request will pass along the chain of handlers where each one can decide either to process the request or pass it to the next handler in the chain.  