import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[] {1,1,1,2,2,3}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[] {1}, 1)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        PriorityQueue<HashMap.Entry<Integer, Integer>> queue = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue()
        );

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k) queue.poll();
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++)
            res[i] = queue.poll().getKey();

        return res;
    }
}