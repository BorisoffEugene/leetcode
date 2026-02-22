import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkValid(new int[][] {{1,2,3},{3,1,2},{2,3,1}}));
        System.out.println(checkValid(new int[][] {{1,1,1},{1,2,3},{1,2,3}}));
    }

    public static boolean checkValid(int[][] matrix) {
        int len = matrix.length;

        for (int i = 0; i < len; i++) {
            Set s1 = new HashSet<>();
            Set s2 = new HashSet<>();
            for (int j = 0; j < len; j++) {
                if (!s1.add(matrix[i][j])) return false;
                if (!s2.add(matrix[j][i])) return false;
            }
        }

        return true;
    }
}