## Scenario

### Problem

Imagine you're creating an app like Zomato where you collect the menus and all the relevant data of several restaurants and combine them into a single delivery platform. Now, your application downloads and collects this data from multiple sources in XML format and then, using those, it displays nice looking menu images and recommendations for the user to pick from.  The app you created is now booming, and at some point you decide to enhance it by introducing major UI changes that will drastically improve the user experience and, luckily, you found exactly what you need on the market; a third-party library that has all kinds of fancy components along with several crazy customizations. However, there's a catch; this third-party library only works with data in JSON format.

### Solution

What we need is a kind of an Adapter similar to the one you use between the American and European power-plug.  This adapter will take all of our XML data and transform it to JSON, making it compatible with the third-party library we are making use of.  So, the Adapter Pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate with one another. 

