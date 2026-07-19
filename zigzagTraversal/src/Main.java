import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(zigzagTraversal(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        System.out.println(zigzagTraversal(new int[][]{{2,1},{2,1},{2,1}}));
        System.out.println(zigzagTraversal(new int[][]{{1,2},{3,4}}));
    }

    public static List<Integer> zigzagTraversal(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int start;
        List<Integer> res = new ArrayList<>();


        for (int r = 0; r < n; r++)
            if ((r & 1) == 0)
                for (int c = 0; c < m; c += 2)
                    res.add(grid[r][c]);
            else {
                start = (m & 1) == 1 ? m - 2 : m - 1;
                for (int c = start; c >= 0; c -= 2)
                    res.add(grid[r][c]);
            }

        return res;
    }
}