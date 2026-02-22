public class Main {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(0));
        System.out.println(mySqrt(2147395600));
    }

    public static int mySqrt(int x) {
        double res = 1;
        while (true) {
            double nx = (res + x / res) / 2;
            if (Math.abs(res - nx) < 1e-10) break;
            res = nx;
        }

        return (int) Math.floor(res);
    }
}