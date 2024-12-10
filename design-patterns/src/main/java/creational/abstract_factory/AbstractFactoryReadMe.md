## Scenario

### Problem

In this example, we focus on manufacturing GPUs and Monitors, specifically for brands MSI and ASUS. The Factory Method pattern suggests that all the four products MsiGpu, AsusGpu, MsiMonitor and AsusMonitor must implement a common interface called Component. The single createComponent method in MsiManufacturer and AsusManufacturer would accept the desired product type and returns Product. 
This implementation violates open-closed principle, because we should decide creating objects based on received type.

### Solution

What abstract factory pattern suggests is nothing but a list of Factory Methods in the creator class. It suggests clearly defining interfaces for each product and ensuring all product variants follow these interfaces. Next, create inside the abstract factory your Company class list of factory methods for each abstract product. In this case, we have two abstract products, the GPU and the Monitor interfaces, leading to two factory methods. 

