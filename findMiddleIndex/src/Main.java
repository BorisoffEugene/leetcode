import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMiddleIndex(new int[] {2,3,-1,8,4}));
        System.out.println(findMiddleIndex(new int[] {1,-1,4}));
        System.out.println(findMiddleIndex(new int[] {2,5}));
        System.out.println(findMiddleIndex(new int[] {1}));
    }

    public static int findMiddleIndex(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] == 0) return 0; else return -1;
        }
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        Arrays.fill(leftSum, Integer.MAX_VALUE);
        leftSum[0] = 0;
        leftSum[1] = nums[0];
        Arrays.fill(rightSum, Integer.MAX_VALUE);
        rightSum[nums.length - 1] = 0;
        rightSum[nums.length - 2] = nums[nums.length - 1];

        for (int i = 0; i < nums.length; i++)
            if (leftSumByIdx(i, leftSum, nums) == rightSumByIdx(i, rightSum, nums)) return i;

        return -1;
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