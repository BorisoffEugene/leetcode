import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[] {1,2,1})));
        System.out.println(Arrays.toString(getConcatenation(new int[] {1,3,2,1})));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] res = new int[2 * nums.length];
        System.arraycopy(nums, 0, res, 0, nums.length);
        System.arraycopy(nums, 0, res, nums.length, nums.length);

        return res;
    }
}