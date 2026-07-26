public class Main {
    public static void main(String[] args) {
        System.out.println(incremovableSubarrayCount(new int[] {1,2,3,4}));
        System.out.println(incremovableSubarrayCount(new int[] {6,5,7,8}));
        System.out.println(incremovableSubarrayCount(new int[] {8,7,6,6}));
    }

    public static int incremovableSubarrayCount(int[] nums) {
        int res = 0;

        for (int i = 0; i < nums.length; i++)
            for (int j = i; j < nums.length; j++)
                if (check(nums, i, j)) res++;

        return res;
    }

    public static boolean check(int[] nums, int i, int j) {
        if (j < nums.length - 1 && i > 0 && nums[j + 1] <= nums[i - 1]) return false;

        for (int k = 1; k < i; k++)
            if (nums[k] <= nums[k - 1]) return false;

        for (int k = j + 2; k < nums.length; k++)
            if (nums[k] <= nums[k - 1]) return false;

        return true;
    }
}