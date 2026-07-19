public class Main {
    public static void main(String[] args) {
        System.out.println(oddCells(2, 3, new int[][]{{0,1},{1,1}}));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        int oddRows = 0;
        int oddCols = 0;

        for (int[] index : indices) {
            rows[index[0]] = !rows[index[0]];
            oddRows += rows[index[0]] ? 1 : -1;

            cols[index[1]] = !cols[index[1]];
            oddCols += cols[index[1]] ? 1 : -1;
        }

        return oddRows * (n - oddCols) + oddCols * (m - oddRows);
    }
}