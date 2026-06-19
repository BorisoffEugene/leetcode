import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberGame(new int[]{5, 4, 2, 3})));
        System.out.println(Arrays.toString(numberGame(new int[]{2, 5})));
    }

    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int tmp;
        for (int i = 0; i < nums.length - 1; i+=2) {
            tmp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = tmp;
        }

        return nums;
    }
}