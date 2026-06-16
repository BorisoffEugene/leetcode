import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(largestLocal(new int[][]{{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}})));
    }

    public static int[][] largestLocal(int[][] grid) {
        int len = grid.length - 2;
        int[][] res = new int[len][len];

        for (int i = 0; i < len; i++)
            for (int j = 0; j < len; j++)
                res[i][j] = max(i, j, grid);

        return res;
    }

    public static int max(int startI, int startJ, int[][] grid) {
        int res = 1;

        for (int i = startI;  i < startI + 3; i++)
            for (int j = startJ;  j < startJ + 3; j++)
                if (grid[i][j] > res) res = grid[i][j];

        return res;
    }
}