import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(distinctDifferenceArray(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(distinctDifferenceArray(new int[]{3,2,3,4,2})));
        System.out.println(Arrays.toString(distinctDifferenceArray(new int[]{8})));
    }

    public static int[] distinctDifferenceArray(int[] nums) {
        boolean[] freqLeft = new boolean[51];
        int[] res = new int[nums.length];
        int lastVal = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!freqLeft[nums[i]]) {
                freqLeft[nums[i]] = true;
                lastVal++;
            }

            res[i] += lastVal;
        }

        boolean[] freqRight = new boolean[51];
        lastVal = 0;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (!freqRight[nums[i + 1]]) {
                freqRight[nums[i + 1]] = true;
                lastVal++;
            }

            res[i] -= lastVal;
        }

        return res;
    }
}