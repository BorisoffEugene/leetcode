import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFinalState(new int[] {2,1,3,5,6}, 5, 2)));
    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        for (int i = 0; i < nums.length; i++)
            pq.add(new int[] {nums[i], i});

        int[] tmp;
        for (int i = 0; i < k; i++) {
            tmp = pq.poll();
            tmp[0] *= multiplier;
            nums[tmp[1]] = tmp[0];
            pq.add(tmp);
        }

        return nums;
    }
}