public class Main {
    public static void main(String[] args) {
        System.out.println(findTheArrayConcVal(new int[]{7,52,2,4}));
        System.out.println(findTheArrayConcVal(new int[]{5,14,13,8,12}));
    }

    public static long findTheArrayConcVal(int[] nums) {
        if (nums.length == 1) return nums[0];

        long res = 0L;
        int left = 0;
        int right = nums.length - 1;

        while (right > left) {
            res += (long) nums[left] * getPower10(nums[right]) + nums[right];
            left++;
            right--;
        }

        if (right == left) res += nums[right];

        return res;
    }

    public static int getPower10(int num) {
        if (num < 10) return 10;
        if (num < 100) return 100;
        if (num < 1_000) return 1_000;
        if (num < 10_000) return 10_000;
        return 100_000;
    }
}