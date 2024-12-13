## Scenario

### Problem

Consider the WorldOfWarcraftLoaderClass, and when we need to load the game, this class will be instantiated and the load() method will be called. Now, a few weeks later the manager asks you to develop the loading screen of Diablo asked while developing. You noticed that both classes share the same exact steps and notice some of their implementations may vary. An example could be that, while the code for creating and loading the various needed objects was entirely different, in both cases the code behind the deleting and the cleaning of temporary files was almost identical. Wouldn't it be great to get rid of the code duplication all-while leaving the steps and their order inside the algorithm structure intact?

### Solution

Well, the Template Method Pattern suggests that you break down your algorithm into a series of steps or methods, then what you have to do is put a series of calls to these methods or steps inside a single template method, which in our case is the loadMethod. The steps may either be abstract or have some default implementation inside the. Parent class. Now to use the algorithm defined by the series of steps, the client must provide its own subclass, implement all abstract steps, and if needed to be overwritten some of the optional ones, but not the template method itself.  Let's see how this will play out with our game loading classes. 