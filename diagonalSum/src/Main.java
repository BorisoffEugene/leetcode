public class Main {
    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}}));
        System.out.println(diagonalSum(new int[][] {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}}));
        System.out.println(diagonalSum(new int[][] {{5}}));
    }

    public static int diagonalSum(int[][] mat) {
        int res = 0;
        if (mat.length % 2 != 0) res -= mat[mat.length / 2][mat.length / 2];

        for (int i = 0; i < mat.length; i++)
            res += mat[i][i] + mat[i][mat.length - 1 - i];

        return res;
    }
}