import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(allCellsDistOrder(2, 3, 1, 2)));
    }

    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] res = new int[rows * cols][2];

        int i = 0;
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++) {
                res[i][0] = r;
                res[i++][1] = c;
            }

        Arrays.sort(res, (a, b) -> {
            int distA = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int distB = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return Integer.compare(distA, distB);
        });

        return res;
    }
}