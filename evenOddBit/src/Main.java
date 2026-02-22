import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenOddBit(50)));
        System.out.println(Arrays.toString(evenOddBit(2)));
    }

    public static int[] evenOddBit(int n) {
        int[] res = new int[2];
        int idx = 0;

        while (n > 0) {
            if ((n & 1) == 1) res[idx]++;
            idx = 1 - idx;
            n /= 2;
        }

        return res;
    }
}