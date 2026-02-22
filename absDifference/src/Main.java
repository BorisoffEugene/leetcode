import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(absDifference(new int[] {5,2,2,4}, 2));
        System.out.println(absDifference(new int[] {100}, 1));
    }

    public static int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int res = 0;

        for (int i = 0; i < k; i++)
            res = res + nums[nums.length - 1 - i] - nums[i];

        return res;
    }
}