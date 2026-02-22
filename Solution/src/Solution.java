import java.util.Arrays;
import java.util.Random;

class Solution {
    private int[] copy;
    private int[] nums;
    Random rand;
    int idx;
    int tmp;

    public Solution(int[] nums) {
        copy = Arrays.copyOf(nums, nums.length);
        this.nums = nums;
    }

    public int[] reset() {
        return copy;
    }

    public int[] shuffle() {
        rand = new Random();

        for (int i = nums.length - 1; i > 0; i--) {
            idx = rand.nextInt(i + 1);
            tmp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = tmp;
        }

        return nums;
    }
}