import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(deleteGreatestValue(new int[][]{{1,2,4},{3,3,1}}));
        System.out.println(deleteGreatestValue(new int[][]{{10}}));
    }

    public static int deleteGreatestValue(int[][] grid) {
        for (int[] elm : grid)
            Arrays.sort(elm);

        int len = grid[0].length - 1;
        int max;
        int res = 0;
        for (int j = len; j >= 0; j--) {
            max = grid[0][j];

            for (int i = 1; i < grid.length; i++)
                if (max < grid[i][j]) max = grid[i][j];

            res += max;
        }

        return res;
    }
}