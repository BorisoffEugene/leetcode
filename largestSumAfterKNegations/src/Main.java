import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(largestSumAfterKNegations(new int[] {4,2,3}, 1));
        System.out.println(largestSumAfterKNegations(new int[] {3,-1,0,2}, 3));
        System.out.println(largestSumAfterKNegations(new int[] {2,-3,-1,5,-4}, 2));
    }

    public static int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }

            sum += nums[i];
            if (min > nums[i]) min = nums[i];
        }

        if ((k & 1) == 1) sum -= 2 * min;

        return sum;
    }
}