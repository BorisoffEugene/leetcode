public class Main {
    public static void main(String[] args) {
        int[][] grid1 = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(grid1));

        int[][] grid2 = {{1}};
        System.out.println(islandPerimeter(grid2));

        int[][] grid3 = {{1, 0}};
        System.out.println(islandPerimeter(grid3));
    }

    public static int islandPerimeter(int[][] grid) {
        int res = 0;

        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                res += rowPerimeter(grid, i, j);

        return res;
    }

    public static int rowPerimeter(int[][] grid, int i, int j) {
        int res = 0;
        if (grid[i][j] == 0) return res;

        if (i == 0) res++;
        if (i == grid.length - 1) res++;

        if (j == 0) res++;
        if (j == grid[0].length - 1) res++;

        if ( i > 0 && grid[i - 1][j] == 0) res++;
        if ( i < grid.length - 1 && grid[i + 1][j] == 0) res++;

        if ( j > 0 && grid[i][j - 1] == 0) res++;
        if ( j < grid[0].length - 1 && grid[i][j + 1] == 0) res++;

        return res;
    }
}