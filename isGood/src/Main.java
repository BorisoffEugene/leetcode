import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isGood(new int[] {2, 1, 3}));
        System.out.println(isGood(new int[] {1, 3, 3, 2}));
        System.out.println(isGood(new int[] {1, 1}));
        System.out.println(isGood(new int[] {3, 4, 4, 1, 2, 1}));
    }

    public static boolean isGood(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] != i+1) return false;

        return nums[nums.length - 2] == nums[nums.length - 1];
    }
}