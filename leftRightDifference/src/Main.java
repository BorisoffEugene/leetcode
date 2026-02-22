import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRightDifference(new int[] {10,4,8,3})));
        System.out.println(Arrays.toString(leftRightDifference(new int[] {1})));
    }

    public static int[] leftRightDifference(int[] nums) {
        if (nums.length == 1) return new int[] {0};

        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        Arrays.fill(leftSum, Integer.MAX_VALUE);
        leftSum[0] = 0;
        leftSum[1] = nums[0];
        Arrays.fill(rightSum, Integer.MAX_VALUE);
        rightSum[nums.length - 1] = 0;
        rightSum[nums.length - 2] = nums[nums.length - 1];

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            res[i] = Math.abs(leftSumByIdx(i, leftSum, nums) - rightSumByIdx(i, rightSum, nums));

        return res;
    }

    public static int leftSumByIdx(int idx, int[] leftSum, int[] nums) {
        if (leftSum[idx] != Integer.MAX_VALUE) return leftSum[idx];

        for (int i = 2; i <= idx; i++) {
            if (leftSum[i] != Integer.MAX_VALUE) continue;
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        return leftSum[idx];
    }

    public static int rightSumByIdx(int idx, int[] rightSum, int[] nums) {
        if (rightSum[idx] != Integer.MAX_VALUE) return rightSum[idx];

        for (int i = rightSum.length - 3; i >= idx; i--) {
            if (rightSum[i] != Integer.MAX_VALUE) continue;
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        return rightSum[idx];
    }
}