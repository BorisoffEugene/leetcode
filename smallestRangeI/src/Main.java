public class Main {
    public static void main(String[] args) {
        System.out.println(smallestRangeI(new int[] {1}, 0));
        System.out.println(smallestRangeI(new int[] {0, 10}, 2));
        System.out.println(smallestRangeI(new int[] {1, 3, 6}, 3));
    }

    public static int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        int res = max - min - 2 * k;
        if (res <= 0) return 0;
        return res;
    }
}