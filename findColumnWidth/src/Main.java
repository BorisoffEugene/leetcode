import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findColumnWidth(new int[][] {{1},{22},{333}})));
        System.out.println(Arrays.toString(findColumnWidth(new int[][] {{-15,1,3},{15,7,12},{5,6,-2}})));
    }

    public static int[] findColumnWidth(int[][] grid) {
        int[] res = new int[grid[0].length];

        for (int j = 0; j < res.length; j++) {
            res[j] = String.valueOf(grid[0][j]).length();
            for (int i = 1; i < grid.length; i++)
                res[j] = Math.max(res[j], String.valueOf(grid[i][j]).length());
        }

        return res;
    }
}