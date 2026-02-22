public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfGoodNumbers(new int[] {1,3,2,1,5,4}, 2));
        System.out.println(sumOfGoodNumbers(new int[] {47,47}, 1));
    }

    public static int sumOfGoodNumbers(int[] nums, int k) {
        int res = 0;

        for (int i = 0; i < nums.length; i++)
            if (checkGood(i, nums, k)) res += nums[i];

        return res;
    }

    public static boolean checkGood(int idx, int[] nums, int k) {
        if (idx - k >= 0 && nums[idx] <= nums[idx - k]) return false;
        if (idx + k < nums.length && nums[idx] <= nums[idx + k]) return false;

        return true;
    }
}