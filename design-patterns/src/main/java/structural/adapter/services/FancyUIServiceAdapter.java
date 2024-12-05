package structural.adapter.services;

import structural.adapter.IMultiRestaurantApp;
import structural.adapter.model.JsonData;
import structural.adapter.model.XmlData;

/**
 * Adapter Class
 * Extends the old Code's Interface
 * Injected the new API through Composition
 */
public class FancyUIServiceAdapter implements IMultiRestaurantApp {
    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter(FancyUIService fancyUIService) {
        this.fancyUIService = fancyUIService;
    }

    @Override
    public void displayMenu(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayMenus(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayRecommendations(jsonData);
    }

    private JsonData convertXmlToJson(XmlData xmlData) {
        // Convert XmlData to JsonData and return it
        return new JsonData();
    }
}
