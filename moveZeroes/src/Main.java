import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
        moveZeroes(new int[]{0});
    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean changed = false;
            for (int j = i; j < nums.length - 1; j++)
                if (nums[j] == 0 && nums[j + 1] != 0) {
                    int a = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = a;
                    changed = true;
                }

            if (!changed) break;
        }

        System.out.println(Arrays.toString(nums));
    }
}