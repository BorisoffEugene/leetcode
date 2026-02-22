import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(minSubsequence(new int[]{4,3,10,9,8}));
        System.out.println(minSubsequence(new int[]{4,4,7,6,7}));
    }

    public static List<Integer> minSubsequence(int[] nums) {
        int allSum = 0;
        for (int num : nums)
            allSum += num;

        Arrays.sort(nums);

        int len = nums.length - 1;
        int partSum = 0;
        List<Integer> res = new ArrayList<>();

        for (int i = len; i >= 0; i--) {
            partSum += nums[i];
            res.add(nums[i]);
            if (partSum > allSum - partSum) break;
        }

        return res;
    }
}