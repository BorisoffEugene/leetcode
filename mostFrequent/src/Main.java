import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(mostFrequent(new int[] {1,100,200,1,100}, 1));
        System.out.println(mostFrequent(new int[] {2,2,2,2,3}, 2));
    }

    public static int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length - 1;
        int max = 1;
        int val;

        for (int i = 0; i < len; i++)
            if (nums[i] == key) {
                val = map.getOrDefault(nums[i + 1], 0) + 1;
                if (val > max) max = val;
                map.put(nums[i + 1], val);
            }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            if (entry.getValue() == max)
                return entry.getKey();

        return -1;
    }
}