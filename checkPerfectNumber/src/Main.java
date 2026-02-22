public class Main {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
        System.out.println(checkPerfectNumber(7));
        System.out.println(checkPerfectNumber(2016));
    }

    public static boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        if (num < 6) return false;

        int end = num / 2 + 1;
        int res = 1;

        for (int i = 2; i <= end; i++) {
            if (num % i == 0) {res += i; if (num / i > i) res += num / i; end = num / i - 1;}
            if (res > num) return false;
        }

        return res == num;
    }
}