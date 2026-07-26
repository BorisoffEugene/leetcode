public class Main {
    public static void main(String[] args) {
        System.out.println(minimumPairRemoval(new int[] {5,2,3,1}));
        System.out.println(minimumPairRemoval(new int[] {1,2,2}));
    }

    public static int minimumPairRemoval(int[] nums) {
        int len = nums.length;
        int cnt = 0;
        int sum;
        int min;
        int idx;

        while (!isSorted(nums, len)) {
            min = Integer.MAX_VALUE;
            idx = -1;

            for (int i = 1; i < len; i++) {
                sum = nums[i - 1] + nums[i];
                if (sum < min) {
                    min = sum;
                    idx = i - 1;
                }
            }

            nums[idx] = min;
            for (int i = idx + 1; i < len - 1; i++)
                nums[i] = nums[i + 1];

            len--;
            cnt++;
        }

        return cnt;
    }

    public static boolean isSorted(int[] nums, int len) {
        for (int i = 1; i < len; i++)
            if (nums[i] < nums[i - 1]) return false;

        return true;
    }
}