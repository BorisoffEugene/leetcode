public class Main {
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(521));
        System.out.println(alternateDigitSum(111));
        System.out.println(alternateDigitSum(886996));
    }

    public static int alternateDigitSum(int n) {
        if (n < 10) return n;

        int len = (int)Math.log10(n) + 1;
        int sign = (len % 2 == 0) ? -1 : 1;

        int res = 0;

        while (n > 0) {
            res += sign * (n % 10);
            n /= 10;
            sign *= -1;
        }

        return res;
    }
}