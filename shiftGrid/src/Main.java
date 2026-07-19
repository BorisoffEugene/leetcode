import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(shiftGrid(new int[][]{{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}}, 4));
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = n * m;
        k = k % total;
        List<List<Integer>> res = new ArrayList<>(m);

        for (int r = 0; r < m; r++) {
            List<Integer> row = new ArrayList<>(n);

            for (int c = 0; c < n; c++) {
                int newIndex = r * n + c;
                int oldIndex = (newIndex - k + total) % total;
                int oldRow = oldIndex / n;
                int oldCol = oldIndex % n;
                row.add(grid[oldRow][oldCol]);
            }

            res.add(row);
        }

        return res;
    }
}