public class Main {
    public static void main(String[] args) {
        System.out.println(checkDivisibility(99));
        System.out.println(checkDivisibility(23));
    }

    public static boolean checkDivisibility(int n) {
        int orig = n;
        int sum = 0;
        int prod = 1;
        int mod;

        while (n > 0) {
            mod = n % 10;
            sum += mod;
            prod *= mod;
            n /= 10;
        }

        return orig % (sum + prod) == 0;
    }
}