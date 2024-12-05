## Outline

### Problem

As a real-world analogy, take the government of a country or its president, you see a given country can have only one official government or one official president. So of the individuals who form this government or the person that is currently the president of this country. So the title "the government or the president of X" is a global identifier it is a global point of access used to represent or reference the president or the individuals in charge of this country.

### Solution

Singletons represent exactly the same idea, just like global variables, they let you access your object from anywhere in your application, but on top of that, they encapsulate the attributes of this object in one single class and guarantee that only one instance of this class will be available at any point in time, but why would anyone want to control how many instances a class has? Well, think of a database instance. Only one instance of a database is required and should be used by all the parts of our application. So, instead of creating a new instance every time we need to query our database, we create a singleton database instance and reuse this same instance every time we access our tables by doing this. We didn't only guarantee a faster access and retrieval of the instance, but we also reduced the possibility of encountering an error or exception while creating these several instances.

