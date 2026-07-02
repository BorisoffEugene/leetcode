import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSubsequence(new int[]{2, 1, 3, 3}, 2)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{-1,-2,3,4}, 3)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{3,4,3,3}, 2)));
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(nums[a], nums[b]));

        for (int i = 0; i < k; i++)
            pq.add(i);

        for (int i = k; i < nums.length; i++) {
            pq.add(i);
            pq.poll();
        }

        int[] idx = new int[k];
        int i = 0;
        for (int el : pq)
            idx[i++] = el;
        Arrays.sort(idx);

        int[] res = new int[k];
        for(int j = 0; j < k; j++)
            res[j] = nums[idx[j]];

        return res;
    }
}