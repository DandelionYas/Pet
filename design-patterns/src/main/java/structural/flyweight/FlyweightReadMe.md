## Scenario

### Problem

Imagine you working at Amazon! One day, your manager tells you about a new project to improve the user interface of the company’s website for books. You are now in charge of how books are handled on the site, including how they are stored and displayed. You begin by creating a book class to hold all relevant details about each book. After successfully displaying books, you push your final changes and send the code to your manager for review. While the books look great on your computer, your manager's machine crashes after trying to load them. After hours of troubleshooting, you find out that the crash was due to not enough RAM on your manager's computer because the system was trying to render millions of large book objects, which overwhelmed the available memory.

### Solution

A solution to the problem we are facing could be to apply and implement the Flyweight Design Pattern.  This pattern is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of storing all the data in each object individually.

Keep in mind that the Flyweight Pattern is an optimization, and before applying it, make sure your program does have the RAM consumption problem related to having a massive number of similar objects in memory at the same time.

