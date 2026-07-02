public class Main {
    public static void main(String[] args) {
        System.out.println(largestInteger(1234));
        System.out.println(largestInteger(65875));
        System.out.println(largestInteger(247));
        System.out.println(largestInteger(60));
    }

    public static int largestInteger(int num) {
        if (num < 10) return num;

        int len = String.valueOf(num).length();
        boolean[] isEven = new boolean[len];
        int[] freq = new int[10];

        int k = 0;
        int tmp;
        while (num > 0) {
            tmp = num % 10;
            isEven[k++] = (tmp & 1) == 0;
            freq[tmp]++;
            num /= 10;
        }

        int res = 0;
        int ten = 1;
        for (k = 0; k < len; k++) {
            if (isEven[k])
                res = res + ten * getMinEven(freq);
            else
                res = res + ten * getMinOdd(freq);

            ten *= 10;
        }

        return res;
    }

    public static int getMinEven(int[] freq) {
        for (int i = 0; i < 9; i += 2)
            if (freq[i] > 0) {
                freq[i]--;
                return i;
            }

        return 0;
    }

    public static int getMinOdd(int[] freq) {
        for (int i = 1; i < 10; i += 2)
            if (freq[i] > 0) {
                freq[i]--;
                return i;
            }

        return 0;
    }
}