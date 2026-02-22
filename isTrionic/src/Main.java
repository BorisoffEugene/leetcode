public class Main {
    public static void main(String[] args) {
        System.out.println(isTrionic(new int[] {1,3,5,4,2,6}));
        System.out.println(isTrionic(new int[] {2,1,3}));
    }

    public static boolean isTrionic(int[] nums) {
        int p = 0;

        for (int i = 1; i < nums.length; i++)
            if (nums[i] > nums[i - 1]) p = i; else break;

        if (p == 0 || p == nums.length - 1) return false;

        int q = 0;

        for (int i = p + 1; i < nums.length; i++)
            if (nums[i] < nums[i - 1]) q = i; else break;

        if (q == 0 || q == nums.length - 1) return false;

        for (int i = q + 1; i < nums.length; i++)
            if (nums[i] <= nums[i - 1]) return false;

        return true;
    }
}