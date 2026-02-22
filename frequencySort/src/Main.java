import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequencySort(new int[] {1,1,2,2,2,3})));
        System.out.println(Arrays.toString(frequencySort(new int[] {2,3,1,3,2})));
        System.out.println(Arrays.toString(frequencySort(new int[] {-1,1,-6,4,5,-6,1,4,1})));
    }

    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        Queue<int[]> queue = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            else
                return b[1] - a[1];
        });

        for (Map.Entry<Integer, Integer> elm : map.entrySet())
            queue.add(new int[] {elm.getValue(), elm.getKey()});

        int[] val = new int[2];
        int idx = 0;
        while (!queue.isEmpty()) {
            val = queue.poll();
            for (int i = 0; i < val[0]; i++)
                nums[idx++] = val[1];
        }

        return nums;
    }
}