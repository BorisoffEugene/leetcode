import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][] {{3,7,8},{9,11,13},{15,16,17}}));
        System.out.println(luckyNumbers(new int[][] {{1,10,4,2},{9,3,8,7},{15,16,17,12}}));
        System.out.println(luckyNumbers(new int[][] {{7,8},{1,2}}));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        int[] mins = new int[matrix[0].length];
        int min;
        int idxJ;

        for (int i = 0; i < matrix.length; i++) {
            min = matrix[i][0];
            idxJ = 0;
            for (int j = 1; j < matrix[0].length; j++)
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    idxJ = j;
                }

            if (min > mins[idxJ]) mins[idxJ] = min;
        }

        boolean isMax;
        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < mins.length; j++) {
            if (mins[j] > 0) {
                isMax = true;
                for (int i = 0; i < matrix.length; i++)
                    if (matrix[i][j] > mins[j]) {isMax = false; break;}

                if (isMax) res.add(mins[j]);
            }
        }

        return res;
    }
}