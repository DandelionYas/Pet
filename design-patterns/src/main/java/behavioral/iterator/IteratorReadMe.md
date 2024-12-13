## Scenario

### Problem

It's the holidays, and you plan to visit Paris for a few days to see its main sites and attractions. You can either waste time trying to find the Eiffel Tower by yourself or hire a local guide who will show you everything and share exciting stories.

Imagine you have a graph and want to go through its elements without revealing how it is built. Whether it’s a binary search tree or a red-black tree doesn’t matter. Like the guide who helps you without knowing you, you want to explore the graph in a depth-first search manner, tailored to your interests.

### Solution

The Iterator Design Pattern is a behavioral pattern that removes the traversal behavior of a collection into a separate object called an iterator. This iterator allows elements to be traversed without exposing the collection's structure and manages traversal details like the current position and remaining elements. Multiple iterators can independently traverse the same collection at the same time. Because of this, several iterators can go through the same collection at the same time independently of one another.  

