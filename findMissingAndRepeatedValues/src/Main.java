import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(new int[][] {{1,3},{2,2}})));
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(new int[][] {{9,1,7},{8,9,2},{3,4,6}})));
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        int len = grid.length;
        boolean[] ex = new boolean[len * len + 1];

        for (int i = 0; i < len; i++)
            for (int j = 0; j < len; j++)
                if (ex[grid[i][j]])
                    res[0] = grid[i][j];
                else
                    ex[grid[i][j]] = true;

        for (int i = 1; i < ex.length; i++)
            if (!ex[i]) {
                res[1] = i;
                break;
            }

        return res;
    }
}