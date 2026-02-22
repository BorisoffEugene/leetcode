import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[] {3,4,5,2}));
        System.out.println(maxProduct(new int[] {1,5,4,5}));
    }

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length - 1;

        return (nums[len] - 1) * (nums[len - 1] - 1);
    }
}