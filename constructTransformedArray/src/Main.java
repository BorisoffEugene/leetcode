import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructTransformedArray(new int[] {3,-2,1,1})));
        System.out.println(Arrays.toString(constructTransformedArray(new int[] {-1,4,-1})));
        System.out.println(Arrays.toString(constructTransformedArray(new int[] {-10,-10})));
    }

    public static int[] constructTransformedArray(int[] nums) {
        int[] res = new int[nums.length];
        int idx;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                idx = (i + nums[i]) % nums.length;
            else if (nums[i] < 0)
                idx = (i + nums[i] + nums.length * 100) % nums.length;
            else
                idx = i;

            res[i] = nums[idx];
        }

        return res;
    }
}