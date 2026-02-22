import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[] {3,2,1,5,6,4}, 2));
        System.out.println(findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 4));
    }

    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums)
            queue.add(num);

        for (int i = 1; i < k; i++)
            queue.poll();

        return queue.poll();
    }
}