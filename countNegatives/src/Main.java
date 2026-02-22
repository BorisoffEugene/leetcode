public class Main {
    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
        System.out.println(countNegatives(new int[][] {{3,2},{1,0}}));
    }

    public static int countNegatives(int[][] grid) {
        int res = 0;

        for (int i = grid.length - 1; i >= 0; i--) {
            if (grid[i][grid[0].length - 1] >= 0) break;

            for (int j = grid[0].length - 1; j >= 0; j--)
                if (grid[i][j] < 0) res++; else break;
        }

        return res;
    }
}