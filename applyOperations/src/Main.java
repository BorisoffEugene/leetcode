import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(applyOperations(new int[] {1,2,2,1,1,0})));
        System.out.println(Arrays.toString(applyOperations(new int[] {0,1})));
    }

    public static int[] applyOperations(int[] nums) {
        int len = nums.length - 1;
        for (int i = 0; i < len; i++)
            if (nums[i] != 0 && nums[i + 1] == nums[i]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
                i++;
            }

        int[] res = new int[nums.length];
        int idx = 0;
        for (int num : nums)
            if (num != 0) res[idx++] = num;

        return res;
    }
}