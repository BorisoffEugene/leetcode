public class Main {
    public static void main(String[] args) {
        System.out.println(isUgly(6));
        System.out.println(isUgly(1));
        System.out.println(isUgly(14));
        System.out.println(isUgly(100001));
    }

    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        if (n < 7) return true;

        while (true) {
            if (n == 1) return true;

            if (n % 2 == 0) {n = n / 2; continue;}
            if (n % 3 == 0) {n = n / 3; continue;}
            if (n % 5 == 0) {n = n / 5; continue;}

            return false;
        }
    }
}