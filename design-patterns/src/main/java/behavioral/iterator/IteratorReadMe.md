## Scenario

### Problem

It's the holidays, and you plan to take the next few days off to visit Paris along with all of its main sites and attractions.  Now, once there, you could waste a lot of time walking in circles not even being able to find the Eiffel Tower, or you could hire a local guide who is going to show you every attraction and tell you a lot of exciting stories.  

Imagine you have a graph, and you want to traverse or iterate over the elements of this graph, however, you don't know or, rather, you don't want to expose the underlying implementation of this graph. Maybe this graph is a binary search tree or a red-black tree. Why care?  Just like the guide doesn't really know who you are but still is able to help you, all you want is to traverse the elements of this graph in a in depth first search manner let's say, or in our example, all we want is to visit these particular sites that we find interesting and to do that, the guide we hired will tailor the tour according to our liking or similarly the iterator will visit the elements of the graph according to the algorithm we picked and regardless of the actual underlying implementation of this graph.

### Solution

The Iterator Design Pattern is a behavioral design pattern whose main idea is to extract the traversal behavior of a collection into a separate object called an iterator. This iterator object, on top of providing a way to traverse the elements of a collection without exposing its underlying representation, encapsulates all the traversal details such as the current position and how many elements are left till the end. Because of this, several iterators can go through the same collection at the same time independently of one another.  

