public class Main {
    public static void main(String[] args) {
        //System.out.println(checkGoodInteger(1000));
        //System.out.println(checkGoodInteger(19));
        System.out.println(checkGoodInteger(47));
    }

    public static boolean checkGoodInteger(int n) {
        int val;
        int res = 0;

        while (n > 0) {
            val = n % 10;
            if (val > 1) {
                res = res + val * (val - 1);
                System.out.println(val);
                System.out.println(res);
                if (res >= 50) return true;
            }
            n /= 10;
        }

        return false;
    }
}