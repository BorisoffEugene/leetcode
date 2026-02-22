import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNoZeroIntegers(11)));
        System.out.println(Arrays.toString(getNoZeroIntegers(19)));
        System.out.println(Arrays.toString(getNoZeroIntegers(199)));
        System.out.println(Arrays.toString(getNoZeroIntegers(999)));
    }

    public static int[] getNoZeroIntegers(int n) {
        if (n <= 9) return new int[]{1, n - 1};

        int num1 = 0;
        int num2 = 0;
        int j = 0;
        int val;
        int ost = 0;

        while (n > 0) {
            val = n % 10;
            if (val > 1) {
                ost = 0;
                num1 += (val - 1) * (int) Math.pow(10, j);
                num2 += (int) Math.pow(10, j);
            } else {
                ost = 1;
                num1 += (val + 8) * (int) Math.pow(10, j);
                num2 += 2 * (int) Math.pow(10, j);
            }

            j++;
            n = n / 10 - ost;
            if (n == 1) {num1 += Math.pow(10, j); n = 0;}
        }

        return new int[] {num1, num2};
    }
}