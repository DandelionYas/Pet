package behavioral.template_method.loaders;

import behavioral.template_method.BaseGameLoader;

public class DiabloLoader extends BaseGameLoader {
    @Override
    protected byte[] loadLocalData() {
        System.out.println("Diablo: Loading Local Data...");
        return new byte[0];
    }

    @Override
    protected void createObjects(byte[] data) {
        System.out.println("Diablo: Creating objects from data...");
    }

    @Override
    protected void downloadAdditionalFiles() {
        System.out.println("Diablo: Downloading additional files...");
    }

    @Override
    protected void initializeProfiles() {
        System.out.println("Diablo: Initializing profiles...");
    }
}
