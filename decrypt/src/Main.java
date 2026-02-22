import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decrypt(new int[] {5,7,1,4}, 3)));
        System.out.println(Arrays.toString(decrypt(new int[] {1,2,3,4}, 0)));
        System.out.println(Arrays.toString(decrypt(new int[] {2,4,9,3}, -2)));
    }

    public static int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] res = new int[len];

        if (k == 0) return res;

        if (k > 0) {
            int sum = 0;
            for (int i = 1; i <= k; i++)
                sum += code[i];

            res[0] = sum;
            for (int i = 1; i < len; i++)
                res[i] = res[i - 1] - code[i] + code[(i + k) % len];

            return res;
        }


        k = -k;
        int sum = 0;
        for (int i = 1; i <= k; i++)
            sum += code[len - i];

        res[0] = sum;
        for (int i = 1; i < len; i++)
            res[i] = res[i - 1] - code[(len - k + i - 1) % len] + code[i - 1];

        return res;
    }
}