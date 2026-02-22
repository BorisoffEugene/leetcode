import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(countPartitions(new int[] {10,10,3,7,6}));
    }

    public static int countPartitions(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        leftSum[0] = nums[0];
        rightSum[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length - 1; i++)
            leftSum[i] = leftSum[i - 1] + nums[i];

        for (int i = nums.length - 2; i > 0; i--)
            rightSum[i] = rightSum[i + 1] + nums[i];

        int res = 0;
        for (int i = 1; i < nums.length; i++)
            if ((leftSum[i - 1] - rightSum[i]) % 2 == 0) res++;

        return res;
    }
}