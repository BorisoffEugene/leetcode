public class Main {
    public static void main(String[] args) {
        System.out.println(projectionArea(new int[][]{{1,1,1},{1,0,1},{1,1,1}}));
    }

    public static int projectionArea(int[][] grid) {
        int res = 0;
        int rMax;
        int cMax;

        for (int i = 0; i < grid.length; i++) {
            rMax = 0;
            cMax = 0;

            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > 0) res++;

                if (grid[i][j] > rMax) rMax = grid[i][j];
                if (grid[j][i] > cMax) cMax = grid[j][i];
            }

            res += rMax + cMax;
        }

        return res;
    }
}