import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[] {1,2,2,3,1}));
        System.out.println(findShortestSubArray(new int[] {1,2,2,3,1,4,2}));
    }

    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();
        int[] val;
        int max = 1;

        for (int i = 0; i < nums.length; i++)
            if (!map.containsKey(nums[i]))
                map.put(nums[i], new int[] {1, i - 1, i});
            else {
                val = map.get(nums[i]);
                val[0]++;
                val[2] = i;
                if (val[0] > max) max = val[0];
            }

        int res = Integer.MAX_VALUE;
        for (int[] elm : map.values())
            if (max == elm[0] && res > elm[2] - elm[1])
                res = elm[2] - elm[1];

        return res;
    }
}