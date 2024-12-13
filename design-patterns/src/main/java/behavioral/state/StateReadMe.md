## Scenario

### Problem

Most smartphones have at least two main buttons: the home button and the power button. The actions of these buttons change depending on the phone's state. For example, if the phone is locked, pressing the power button turns it on, but if it is unlocked, pressing the same button locks it again. This behavior can be explained using a finite state machine, where a program can be in a limited number of states, each with different functions.

In the smartphone example, the phone can be off, locked, or ready to use. When the phone is off, it can be turned on with either the power button or the home button, but it will still be locked. To unlock it, the home button must be pressed again. While using the phone, the home button can return to the home page, and the power button can turn it off again.

### Solution

This concept is closely related to the State Design Pattern. The state pattern is a behavioral design pattern that lets an object alter its behavior based on its internal state changes.