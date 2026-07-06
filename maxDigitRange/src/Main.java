public class Main {
    public static void main(String[] args) {
        System.out.println(maxDigitRange(new int[] {5724,111,350}));
        System.out.println(maxDigitRange(new int[] {90,900}));
    }

    public static int maxDigitRange(int[] nums) {
        int[] sum = new int[10];

        for (int num :nums)
            sum[range(num)] += num;

        for (int i = 9; i >= 0; i--)
            if (sum[i] > 0) return sum[i];

        return -1;
    }

    public static int range(int num) {
        int max = 0;
        int min = 9;
        int tmp;

        while (num > 0) {
            tmp = num % 10;
            if (tmp > max) max = tmp;
            if (tmp < min) min = tmp;
            num /= 10;
        }

        return max - min;
    }
}