public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            x = -x;
            sign = -1;
        }

        long res = 0L;
        while (x > 0) {
            res = res * 10 + x % 10;
            if (sign * res  < Integer.MIN_VALUE || sign * res > Integer.MAX_VALUE) return 0;
            x /= 10;
        }

        return (int)(sign * res);
    }
}