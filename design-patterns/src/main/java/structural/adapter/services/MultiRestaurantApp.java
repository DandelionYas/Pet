package structural.adapter.services;

import structural.adapter.IMultiRestaurantApp;
import structural.adapter.model.XmlData;

public class MultiRestaurantApp implements IMultiRestaurantApp {
    @Override
    public void displayMenu(XmlData xmlData) {
        // Make use of XmlData to fetch menus
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        // Make use of the XmlData to load recommendations
    }
}
