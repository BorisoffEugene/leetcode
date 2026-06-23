import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findDegrees(new int[][] {{0,1,1},{1,0,1},{1,1,0}})));
        System.out.println(Arrays.toString(findDegrees(new int[][] {{0,1,0},{1,0,0},{0,0,0}})));
        System.out.println(Arrays.toString(findDegrees(new int[][] {{0}})));
    }

    public static int[] findDegrees(int[][] matrix) {
        int[] res = new int[matrix.length];

        for (int i = 0; i < matrix.length - 1; i++)
            for (int j = i + 1; j < matrix.length; j++)
                if (matrix[i][j] == 1) {
                    res[i]++;
                    res[j]++;
                }

        return res;
    }
}