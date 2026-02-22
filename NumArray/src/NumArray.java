class NumArray {
    private int[] nums;
    private int[] sums;
    private int curIdx = 0;

    public NumArray(int[] nums) {
        sums = new int[nums.length];
        sums[0] = nums[0];
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        return sumIdx(right) - sumIdx(left - 1);
    }

    private int sumIdx(int idx) {
        if (idx == -1) return 0;
        if (curIdx >= idx) return sums[idx];

        for (int i = curIdx + 1; i <= idx; i++)
            sums[i] = sums[i - 1] + nums[i];

        curIdx = idx;
        return sums[idx];
    }
}