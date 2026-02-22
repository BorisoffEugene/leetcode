import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
        System.out.println(Arrays.toString(sumZero(3)));
        System.out.println(Arrays.toString(sumZero(1)));
        System.out.println(Arrays.toString(sumZero(6)));
    }

    public static int[] sumZero(int n) {
        if (n == 1) return new int[] {0};

        int[] res = new int[n];
        int len = n / 2 - 1;

        for (int i = 0; i <= len; i++) {
            res[i] = i + 1;
            res[res.length - 1 - i] = -res[i];
        }

        return res;
    }
}