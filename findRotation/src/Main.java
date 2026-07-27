public class Main {
    public static void main(String[] args) {
        System.out.println(findRotation(new int[][]{{0,0,0},{0,1,0},{1,1,1}}, new int[][]{{1,1,1},{0,1,0},{0,0,0}}));
        System.out.println(findRotation(new int[][]{{0,1},{1,1}}, new int[][]{{1,0},{0,1}}));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int n1i;
        int n1j;
        boolean r0 = true;
        boolean r90 = true;
        boolean r180 = true;
        boolean r270 = true;

        for (int i = 0; i < n; i++) {
            n1i = n - 1 - i;
            for (int j = 0; j < n; j++) {
                n1j = n - 1 - j;
                if (mat[i][j] != target[i][j]) r0 = false;
                if (mat[i][j] != target[j][n1i]) r90 = false;
                if (mat[i][j] != target[n1i][n1j]) r180 = false;
                if (mat[i][j] != target[n1j][i]) r270 = false;

                if (!r0 && !r90 && !r180 && !r270) return false;
            }
        }

        return true;
    }
}