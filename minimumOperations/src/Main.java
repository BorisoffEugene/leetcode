import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[][] {{3,2},{1,3},{3,4},{0,1}}));
    }

    public static int minimumOperations(int[][] grid) {
        int res = 0;
        int val;

        for (int j = 0; j < grid[0].length; j++)
            for (int i = 1; i < grid.length; i++) {
                val = grid[i - 1][j] - grid[i][j] + 1;
                if (val >= 1) {
                    grid[i][j] += val;
                    res += val;
                }
            }

        return res;
    }
}