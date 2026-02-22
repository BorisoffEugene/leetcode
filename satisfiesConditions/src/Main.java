public class Main {
    public static void main(String[] args) {
        System.out.println(satisfiesConditions(new int[][] {{1,0,2},{1,0,2}}));
        System.out.println(satisfiesConditions(new int[][] {{1,1,1},{0,0,0}}));
        System.out.println(satisfiesConditions(new int[][] {{1},{2}, {3}}));
        System.out.println(satisfiesConditions(new int[][] {{1,1,6,1,4,6,3,1,0,7}}));
        System.out.println(satisfiesConditions(new int[][] {{1}}));
    }

    public static boolean satisfiesConditions(int[][] grid) {
        for (int j = 0; j < grid[0].length; j++)
            for (int i = 0; i < grid.length; i++) {
                if (i < grid.length - 1 && grid[i][j] != grid[i + 1][j]) return false;
                if (i == 0 && j < grid[0].length - 1 && grid[0][j] == grid[0][j + 1]) return false;
            }

        return true;
    }
}