import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
    }

    public static int[] plusOne(int[] digits) {
        int[] res = new int[digits.length + 1];
        System.arraycopy(digits, 0, res, 1, digits.length);

        for (int i = res.length - 1; i >= 0; i--) {
            res[i]++;
            if (res[i] == 10)
                res[i] = 0;
            else
                break;
        }

        if (res[0] == 0)
            return Arrays.copyOfRange(res, 1, res.length);
        else
            return res;
    }
}