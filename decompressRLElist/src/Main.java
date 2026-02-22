import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decompressRLElist(new int[] {1,2,3,4})));
        System.out.println(Arrays.toString(decompressRLElist(new int[] {1,1,2,3})));
    }

    public static int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i+=2)
            len += nums[i];

        int[] res = new int[len];
        int idx = 0;
        for (int i = 1; i < nums.length; i+=2)
            for (int j = 0; j < nums[i - 1]; j++)
                res[idx++] = nums[i];

        return res;
    }
}