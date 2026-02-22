import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[] {1,2,3,4})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res, 1);

        for (int i = 1; i < len; i++) {
            res[i] = res[i] * res[i - 1] * nums[i - 1];
            res[len - i - 1] = res[len - i] * nums[len - i];
        }
        
        return res;
    }
}