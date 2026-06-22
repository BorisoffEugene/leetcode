import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(reverseSubmatrix(
                new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}},
                1, 0, 3
        )));
    }

    public static int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int start = x;
        int end = x + k - 1;
        int tmp;

        while (start < end) {
            for (int i = 0; i < k; i++) {
                tmp = grid[start][i + y];
                grid[start][i + y] = grid[end][i + y];
                grid[end][i + y] = tmp;
            }

            start++;
            end--;
        }

        return grid;
    }
}