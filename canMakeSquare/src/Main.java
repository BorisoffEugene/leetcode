public class Main {
    public static void main(String[] args) {
        System.out.println(canMakeSquare(new char[][] {{'B','W','B'},{'B','W','W'},{'B','W','B'}}));
    }

    public static boolean canMakeSquare(char[][] grid) {
        int cnt;

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                cnt = 0;

                cnt += grid[i][j] == 'B' ? 1 : -1;
                cnt += grid[i][j + 1] == 'B' ? 1 : -1;
                cnt += grid[i + 1][j] == 'B' ? 1 : -1;
                cnt += grid[i + 1][j + 1] == 'B' ? 1 : -1;

                if (cnt != 0) return true;
            }

        return false;
    }
}