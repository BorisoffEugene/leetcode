import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber(new int[]{1}));
    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2)
            if (nums[i] != nums[i + 1])
                return nums[i];

        return nums[nums.length - 1];
    }
}