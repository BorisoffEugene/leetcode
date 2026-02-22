public class Main {
    public static void main(String[] args) {
        System.out.println(getLeastFrequentDigit(1553322));
        System.out.println(getLeastFrequentDigit(723344511));
    }

    public static int getLeastFrequentDigit(int n) {
        if (n < 10) return n;

        int[] arr = new int[10];

        while (n > 0) {
            arr[n % 10]++;
            n /= 10;
        }

        int res = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) continue;
            if (arr[i] < min) {
                min = arr[i];
                res = i;
            }
        }

        return res;
    }
}