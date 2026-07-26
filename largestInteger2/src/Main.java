public class Main {
    public static void main(String[] args) {
        System.out.println(largestInteger(2, 9));
        System.out.println(largestInteger(2, 19));
        System.out.println(largestInteger(5, 0));
    }

    public static int largestInteger(int n, int s) {
        if (s == 0) return 0;
        if (s > 9 * n) return -1;

        int res = 0;
        int dig;
        for (int i = 0; i < n; i++) {
            dig = Math.min(9, s);
            res = res * 10 + dig;
            s -= dig;
        }

        return res;
    }
}