package language;

public class CastingScenarios {
    static class Cache{}
    static class DiskCache extends Cache {}
    static class MemoryCache extends Cache {}
    static class OptimizedDiskCache extends DiskCache {}

    public static void main(String[] args) {
        OptimizedDiskCache cache = new OptimizedDiskCache();
        Cache cache2 = (Cache) cache;
        System.out.println(cache2);

        OptimizedDiskCache cache3 = new OptimizedDiskCache();
        DiskCache cache4 = (DiskCache) cache3;
        System.out.println(cache4);

        OptimizedDiskCache cache7 = new OptimizedDiskCache();
        Cache cache8 = (Cache) cache7;
        DiskCache cache9 = (DiskCache) cache8;
        System.out.println(cache9);

//        Error 1:
//        MemoryCache memoryCache = new MemoryCache();
//        Cache memoryCache1 = memoryCache;
//        DiskCache diskCache = (DiskCache) memoryCache1;

//        Error 2:
//        DiskCache diskCache = new DiskCache();
//        OptimizedDiskCache diskCache2 = (OptimizedDiskCache) diskCache;

//        Error 3:
//        Cache cache5 = new Cache();
//        MemoryCache cache6 = (MemoryCache) cache5;
//        System.out.println(cache6);
    }
}
