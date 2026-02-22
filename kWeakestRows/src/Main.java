import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(kWeakestRows(new int[][] {{1,1,0,0,0},
                 {1,1,1,1,0},
                 {1,0,0,0,0},
                 {1,1,0,0,0},
                 {1,1,1,1,1}}, 3)));
        System.out.println(Arrays.toString(kWeakestRows(new int[][] {{1,0,0,0},
                 {1,1,1,1},
                 {1,0,0,0},
                 {1,0,0,0}}, 2)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0])
                return b[0] - a[0];
            else
                return b[1] - a[1];
        });

        int len = mat.length;
        for (int i = 0; i < len; i++) {
            queue.add(new int[]{cntRow(mat[i]), i});
            if (queue.size() > k) queue.poll();
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--)
            res[i] = queue.poll()[1];

        return res;
    }

    public static int cntRow(int[] row) {
        int res = 0;
        for (int r : row) {
            if (r == 0) return res;
            res++;
        }

        return res;
    }
}