import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimumDifference(new int[] {90}, 1));
        System.out.println(minimumDifference(new int[] {9,4,1,7}, 2));
    }

    public static int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;

        Arrays.sort(nums);

        int diff;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            diff = nums[i + k - 1] - nums[i];
            if (diff == 0) return 0;
            if (diff < minDiff) minDiff = diff;
        }

        return minDiff;
    }
}