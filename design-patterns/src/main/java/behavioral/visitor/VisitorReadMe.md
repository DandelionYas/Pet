## Scenario

### Problem

As a software developer at an insurance company, you created separate classes for different clients based on their categories. You identified shared traits among these clients and created a parent class called the Client class. Initially, this was working well, but your manager later asked for an advertising feature to send targeted emails about new insurance offers to clients. For example, residents would receive medical insurance ads, while banks would get theft insurance emails.

Initially, you planned to add a sendMail() method in the Client class and override it in each subclass. However, this approach conflicted with single responsibility and open-closed principles, as it added functionality to the client classes. Changes to the functionality would require modifying each client class individually, so it's necessary to separate these behaviors from the client classes.

At first step lets create an InsuranceMessaging class and move all our messaging behaviour to different methods inside of it for each client. But what exactly would call these methods, especially when dealing with several clients? To pick the proper method, we need to check the class. Doesn't this sound like a nightmare?

### Solution

The visitor pattern is a behavioral design pattern that separates algorithms or behaviors from the objects they work on. It uses a technique called Double-Dispatch. With this approach, objects choose the right method themselves rather than relying on the client to do so. Each object accepts a visitor and tells it which visiting method to run. When handling multiple clients, you simply call the acceptance method along with a visitor.