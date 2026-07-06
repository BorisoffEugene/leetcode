import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rowAndMaximumOnes(new int[][]{{0,1},{1,0}})));
    }

    public static int[] rowAndMaximumOnes(int[][] mat) {
        int[] res = {0, 0};
        int sum;

        for (int i = 0; i < mat.length; i++) {
            sum = 0;
            for (int j = 0; j < mat[0].length; j++)
                sum += mat[i][j];

            if (sum > res[1]) {
                if (sum == mat[0].length) return new int[] {i, sum};
                res[0] = i;
                res[1] = sum;
            }
        }

        return res;
    }
}