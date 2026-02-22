public class Main {
    public static void main(String[] args) {
        System.out.println(checkXMatrix(new int[][] {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}}));
        System.out.println(checkXMatrix(new int[][] {{5,7,0},{0,3,1},{0,5,0}}));
    }

    public static boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid.length; j++)
                if (i == j) {
                    if (grid[i][j] == 0) return false;
                } else if (i == grid.length - 1 - j) {
                    if (grid[i][j] == 0) return false;
                } else {
                    if (grid[i][j] != 0) return false;
                }

        return true;
    }
}