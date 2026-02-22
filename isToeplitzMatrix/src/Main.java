public class Main {
    public static void main(String[] args) {
        System.out.println(isToeplitzMatrix(new int[][] {{1,2,3,4},{5,1,2,3},{9,5,1,2}}));
        System.out.println(isToeplitzMatrix(new int[][] {{1,2},{2,2}}));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {

        for (int j = matrix[0].length - 2; j >= 0; j--) {
            for (int k = j; k < matrix[0].length - 1; k++) {
                if (k >= matrix.length - 1) break;
                System.out.println((k - j) + " ; " + (k));
                //if (matrix[k - j][k] != matrix[k - j + 1][k + 1]) return false;
            }
            System.out.println("-------------");
        }

        /*for (int j = 1; j < matrix.length - 1; j++)
            for (int k = j + 1; k < matrix[0].length; k++)
                if (matrix[k - j][k - j] != matrix[k - j + 1][k - j + 1]) return false;
*/
        return true;
    }
}