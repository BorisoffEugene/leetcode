import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(specialArray(new int[] {3,5}));
        System.out.println(specialArray(new int[] {0,0}));
        System.out.println(specialArray(new int[] {0,4,3,0,4}));
        System.out.println(specialArray(new int[] {3,6,7,7,0}));
    }

    public static int specialArray(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < len; i++)
            if (
                    nums[i] > 0 &&
                    (i == 0 || nums[i] > nums[i - 1]) &&
                    len - i <= nums[i] &&
                    (i == 0 || len - i > nums[i - 1])
            ) return len - i;

        return -1;
    }
}