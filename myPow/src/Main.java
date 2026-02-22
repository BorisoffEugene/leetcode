public class Main {
    public static void main(String[] args) {
        System.out.println(myPow(2.0, 10));
        System.out.println(myPow(2.1, 3));
        System.out.println(myPow(2.0, -2));
        System.out.println(myPow(0.00001, 2147483647));
        System.out.println(myPow(-3.0, -5));
        System.out.println(myPow(1.0, 2147483647));
        System.out.println(myPow(2.0, -2147483648));
        System.out.println(myPow(-1.0, 2147483647));
    }

    public static double myPow(double x, int n) {
        if (x == 0) return 0.0;
        if (n == 0) return 1.0;
        if (x == 1) return 1.0;
        if (x == -1) {if (n % 2 == 1) return -1.0; else return 1.0;}

        double res = 1.0;

        if (n > 0)
            for (int i = 1; i <= n; i++) {
                res *= x;
                if (Math.abs(res) < 0.000001) break;
            }
        else
            for (int i = n; i <= -1; i++) {
                res /= x;
                if (Math.abs(res) < 0.000001) break;
            }

        return res;
    }
}