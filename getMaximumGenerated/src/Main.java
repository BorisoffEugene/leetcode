import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getMaximumGenerated(7));
        System.out.println(getMaximumGenerated(2));
        System.out.println(getMaximumGenerated(3));
    }

    public static int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] res = new int[n + 1];
        res[1] = 1;
        int max = 1;

        for (int i = 2; i <= n; i++) {
            if ((i & 1) == 1)
                res[i] = res[i / 2] + res[i / 2 + 1];
            else
                res[i] = res[i / 2];
            if (max < res[i]) max = res[i];
        }

        return max;
    }
}