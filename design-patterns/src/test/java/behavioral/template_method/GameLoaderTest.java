package behavioral.template_method;

import behavioral.template_method.loaders.DiabloLoader;
import behavioral.template_method.loaders.WorldOfWarcraftLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameLoaderTest {

    @Test
    public void testGameLoader() {
        BaseGameLoader wowGameLoader = new WorldOfWarcraftLoader();
        Assertions.assertDoesNotThrow(wowGameLoader::load);

        BaseGameLoader diabloGameLoader = new DiabloLoader();
        Assertions.assertDoesNotThrow(diabloGameLoader::load);
    }
}
