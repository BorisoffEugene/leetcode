import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
        System.out.println(Arrays.toString(countBits(5)));
        System.out.println(Arrays.toString(countBits(0)));
    }

    public static int[] countBits(int n) {
        int[] res = new int[n + 1];

        for (int i = 0; i <= n; i++)
            res[i] = Integer.bitCount(i);

        return res;
    }
}