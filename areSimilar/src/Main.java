public class Main {
    public static void main(String[] args) {
        System.out.println(areSimilar(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, 4));
    }

    public static boolean areSimilar(int[][] mat, int k) {
        int n = mat[0].length;
        if (k % n == 0) return true;

        int m = mat.length;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] != mat[i][(j + k) % n]) return false;

        return true;
    }
}