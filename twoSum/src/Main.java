import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) return new int[]{0, 1};

        int diff;
        Integer val;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            diff = target - nums[i];
            val = map.get(diff);
            if (val == null)
                map.put(nums[i], i);
            else
                return new int[]{i, val};
        }

        return new int[]{};
    }
}