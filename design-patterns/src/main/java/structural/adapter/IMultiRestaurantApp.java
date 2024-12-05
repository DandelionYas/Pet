package structural.adapter;

import structural.adapter.model.XmlData;

public interface IMultiRestaurantApp {
    void displayMenu(XmlData xmlData);
    void displayRecommendations(XmlData xmlData);
}
