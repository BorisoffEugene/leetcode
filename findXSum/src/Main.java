import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findXSum(new int[]{1,1,2,2,3,4,2,3}, 6, 2)));
        System.out.println(Arrays.toString(findXSum(new int[]{3,8,7,8,7,5}, 2, 2)));
    }

    public static int[] findXSum(int[] nums, int k, int x) {
        int len = nums.length;
        int[] freq = new int[51];
        int[] res = new int[len - k + 1];
        int j = 0;

        // первый раз
        for (int i = 0; i < k; i++)
            freq[nums[i]]++;

        res[j++] = calc(freq, x);

        // остальные разы
        for (int i = k; i < len; i++) {
            freq[nums[i - k]]--;
            freq[nums[i]]++;
            res[j++] = calc(freq, x);
        }

        return res;
    }

    public static int calc(int[] freq, int x) {
        int max;
        int maxJ;
        int res = 0;

        for (int i = 0; i < x; i++) {
            max = 0;
            maxJ = -1;

            for (int j = 1; j < freq.length; j++)
                if (freq[j] >= max) {
                    max = freq[j];
                    maxJ = j;
                }

            if (max == 0) break;

            res += maxJ * max;
            freq[maxJ] = -freq[maxJ];
        }

        for (int j = 1; j < freq.length; j++)
            if (freq[j] < 0) freq[j] = -freq[j];

        return res;
    }
}