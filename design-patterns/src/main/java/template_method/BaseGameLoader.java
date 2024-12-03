package template_method;

public abstract class BaseGameLoader {
    // Playing the role of Template Method
    public void load() {
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        cleanTempTiles();
        initializeProfiles();
    }

    protected abstract byte[] loadLocalData();
    protected abstract void createObjects(byte[] data);
    protected abstract void downloadAdditionalFiles();
    protected abstract void initializeProfiles();

    protected void cleanTempTiles() {
        System.out.println("Cleaning temp tiles");
        // Common logic for all loaders
    }
}
