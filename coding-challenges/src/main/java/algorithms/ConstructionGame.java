package algorithms;

public class ConstructionGame {
    private int [][] table;
    private int length;
    private int width;
    private int height;

    public ConstructionGame(int length, int width) {
        this.table = new int[length][width];
        this.length = length;
        this.width = width;
    }

    public void addCubes(boolean[][] cubes) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (cubes[i][j]) {
                    table[i][j] += 1;
                }
            }
        }
    }

    public int getHeight() {
        int minHeight = Integer.MAX_VALUE;
        int maxHeight = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (table[i][j] < minHeight) {
                    minHeight = table[i][j];
                }
                if (table[i][j] > maxHeight) {
                    maxHeight = table[i][j];
                }
            }
        }
        return maxHeight - minHeight;
    }

    public static void main(String[] args) {
        ConstructionGame game = new ConstructionGame(2, 2);

        game.addCubes(new boolean[][] {
                { true, true },
                { false, false } });
        game.addCubes(new boolean[][] {
                { true, true },
                { false, true } });
        System.out.println(game.getHeight()); // should print 2

        game.addCubes(new boolean[][] {
                { false, false },
                { true, true } });
        System.out.println(game.getHeight()); // should print 1
    }
}