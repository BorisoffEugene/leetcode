import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(matrixReshape(new int[][] {{1,2},{3,4}}, 1, 4)));
        System.out.println(Arrays.deepToString(matrixReshape(new int[][] {{1,2},{3,4}}, 2, 4)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) return mat;

        int[][] res = new int[r][c];
        int idx;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                idx = n * i + j;
                res[idx / c][idx % c] = mat[i][j];
            }

        return res;
    }
}