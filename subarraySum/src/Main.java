public class Main {
    private static int curIdx;
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] {2,3,1}));
        System.out.println(subarraySum(new int[] {3,1,1,2}));
    }

    public static int subarraySum(int[] nums) {
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        curIdx = 0;
        int res = 0;

        for (int i = 0; i < nums.length; i++)
            res = res + sumByIdx(i, sums, nums) - sumByIdx(Math.max(0, i - nums[i]) - 1, sums, nums);

        return res;
    }

    public static int sumByIdx(int idx, int[] sums, int[] nums) {
        if (idx == -1) return 0;
        if (sums[idx] > 0) return sums[idx];

        for (int i = curIdx + 1; i <= idx; i++)
            sums[i] = sums[i - 1] + nums[i];

        curIdx = idx;
        return sums[idx];
    }
}