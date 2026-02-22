import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (true) {
            n = calc(n);
            if (n == 1) return true;
            if (!set.add(n)) return false;
        }
    }

    public static int calc(int n) {
        int res = 0;

        while (n > 0) {
            res += (n % 10) * (n % 10);
            n /= 10;
        }

        return res;
    }
}