import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[] {1,4,2,5,3}));
        System.out.println(sumOddLengthSubarrays(new int[] {1,2}));
        System.out.println(sumOddLengthSubarrays(new int[] {10,11,12}));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        if (arr.length == 1) return arr[0];
        if (arr.length == 2) return arr[0] + arr[1];

        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        int res = 0;
        int k;

        for (int i = 0; i < arr.length; i++) {
            k = i;
            while (k < arr.length) {
                res = res + sumByIdx(k, sum, arr) - sumByIdx(i - 1, sum, arr);
                k += 2;
            }
        }

        return res;
    }

    public static int sumByIdx(int idx, int[] sum, int[] arr) {
        if (idx == -1) return 0;
        if (sum[idx] > 0) return sum[idx];

        for (int i = 1; i <= idx; i++) {
            if (sum[i] > 0) continue;
            sum[i] = arr[i] +  sum[i - 1];
        }

        return sum[idx];
    }
}