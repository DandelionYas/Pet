package structural.adapter;

import org.junit.jupiter.api.Test;
import structural.adapter.model.XmlData;
import structural.adapter.services.FancyUIService;
import structural.adapter.services.FancyUIServiceAdapter;
import structural.adapter.services.MultiRestaurantApp;

public class TestMultiRestaurantService {

    @Test
    public void test() {
        // Old Code Consuming XmlData
        IMultiRestaurantApp multiRestaurantApp = new MultiRestaurantApp();
        multiRestaurantApp.displayMenu(new XmlData());
        multiRestaurantApp.displayRecommendations(new XmlData());

        // New Code Consuming XmlData using Adapter
        FancyUIService fancyUIService = new FancyUIService();
        FancyUIServiceAdapter adapter = new FancyUIServiceAdapter(fancyUIService);
        adapter.displayMenu(new XmlData());
        adapter.displayRecommendations(new XmlData());
    }
}
