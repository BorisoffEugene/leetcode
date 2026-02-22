import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(construct2DArray(new int[] {1,3,5,2,4,6}, 2, 3)[0]));
        System.out.println(Arrays.toString(construct2DArray(new int[] {1,3,5,2,4,6}, 2, 3)[1]));
        System.out.println(Arrays.toString(construct2DArray(new int[] {1,1,1,1}, 1, 4)[0]));
        //System.out.println(Arrays.toString(construct2DArray(new int[] {1,1,1,1}, 4, 1)[1]));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (m*n != original.length) return new int[][]{};

        int[][] res = new int[m][n];

        for (int i = 0; i < original.length; i++)
            res[(n == 1) ? i % m : i / n][(n == 1) ? 0 : i % n] = original[i];

        return res;
    }
}