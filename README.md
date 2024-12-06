# Personal Pet Project
This repository is considered to push codes written to try new technologies or review the old ones

## Review Design Patterns
To review all the 23 Design Patterns I created a module to push sample codes for each pattern. To understand the implementation refer to the ReadMe file for each corresponding Design Pattern. I explained the scenario in which the design pattern is a best practice.
The package structure clearly categorized them into three famous categories:
 - Creational Patterns
 - Structural Patterns
 - Behavioral Patterns

## Data Oriented Programming
Written in two ways:
 - A simple and trivial example to illustrate the usage of **Records**, **sealed Interfaces** and **Pattern Matching**
 - Calling a public RESTFul API using Java's HttpClient and based on Data Oriented Programming pattern:
   -  Reffer to [Open Notify API People In Space](http://open-notify.org/Open-Notify-API/People-In-Space)
   -  Proxy settings configured for HttpClient because the API was not available for me without VPN

## Spring RabbitMQ
 - Use Java 21 & Spring Boot 3.3.6 to connect to the RabbitMQ Broker
 - Contains working samples of producer and consumer
 - Pull RabbitMQ image: `docker pull rabbitmq:{management-tag}`
 - Run RabbitMQ container: `docker run -d -p 15672:15672 -p 5672:5672 --name my-rabbitmq rabbitmq:{management-tag}`