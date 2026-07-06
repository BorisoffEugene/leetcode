public class Main {
    public static void main(String[] args) {
        System.out.println(findChampion(new int[][] {{0,0,1},{1,0,1},{0,0,0}}));
    }

    public static int findChampion(int[][] grid) {
        int[] res = new int[grid.length];
        int max = 0;
        int idx = 0;

        for (int i = 0; i < grid.length - 1; i++)
            for (int j = i + 1; j < grid.length; j++)
                if (grid[i][j] == 1) {
                    res[i]++;
                    if (max < res[i]) {
                        max = res[i];
                        idx = i;
                    }
                } else {
                    res[j]++;
                    if (max < res[j]) {
                        max = res[j];
                        idx = j;
                    }
                }

        return idx;
    }
}