public class Main {
    public static void main(String[] args) {
        System.out.println(surfaceArea(new int[][]{{1,1,1},{1,0,1},{1,1,1}}));
    }

    public static int surfaceArea(int[][] grid) {
        int res = 0;
        int len = grid.length - 1;

        for (int i = 0; i <= len; i++)
            for (int j = 0; j <= len; j++)
                if (grid[i][j] > 0) {
                    res += 2;
                    if (i > 0)
                        res += Math.max(grid[i][j] - grid[i - 1][j], 0);
                    else
                        res += grid[i][j];
                    if (i < len)
                        res += Math.max(grid[i][j] - grid[i + 1][j], 0);
                    else
                        res += grid[i][j];
                    if (j > 0)
                        res += Math.max(grid[i][j] - grid[i][j - 1], 0);
                    else
                        res += grid[i][j];
                    if (j < len)
                        res += Math.max(grid[i][j] - grid[i][j + 1], 0);
                    else
                        res += grid[i][j];
                }

        return res;
    }
}