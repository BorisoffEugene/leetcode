import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(resultArray(new int[]{2,1,3})));
        System.out.println(Arrays.toString(resultArray(new int[]{5,4,3,8})));
    }

    public static int[] resultArray(int[] nums) {
        int len = nums.length;

        int[] a1 = new int[len];
        int[] a2 = new int[len];
        int[] res = new int[len];
        int i1 = 0;
        int i2 = 0;
        a1[i1++] = nums[0];
        a2[i2++] = nums[1];

        for (int i = 2; i < len; i++)
            if (a1[i1 - 1] > a2[i2 - 1])
                a1[i1++] = nums[i];
            else
                a2[i2++] = nums[i];

        System.arraycopy(a1, 0, res, 0, i1);
        System.arraycopy(a2, 0, res, i1, i2);

        return res;
    }
}