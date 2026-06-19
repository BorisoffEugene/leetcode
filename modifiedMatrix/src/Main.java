import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(modifiedMatrix(new int[][] {{1,2,-1},{4,-1,6},{7,8,9}})));
    }

    public static int[][] modifiedMatrix(int[][] matrix) {
        int max;
        List<Integer> mem = new ArrayList<>();

        for (int j = 0; j < matrix[0].length; j++) {
            max = matrix[0][j];
            mem.clear();
            if (matrix[0][j] == -1) mem.add(0);

            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] > max) max = matrix[i][j];
                if (matrix[i][j] == -1) mem.add(i);
            }

            for (int m : mem)
                matrix[m][j] = max;
        }

        return matrix;
    }
}