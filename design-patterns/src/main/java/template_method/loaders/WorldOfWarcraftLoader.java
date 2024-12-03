package template_method.loaders;

import template_method.BaseGameLoader;

public class WorldOfWarcraftLoader extends BaseGameLoader {
    @Override
    protected byte[] loadLocalData() {
        System.out.println("WoW: Loading Local Data...");
        return new byte[0];
    }

    @Override
    protected void createObjects(byte[] data) {
        System.out.println("WoW: Creating objects from data...");
    }

    @Override
    protected void downloadAdditionalFiles() {
        System.out.println("WoW: Downloading additional files...");
    }

    @Override
    protected void initializeProfiles() {
        System.out.println("WoW: Initializing profiles...");
    }
}
