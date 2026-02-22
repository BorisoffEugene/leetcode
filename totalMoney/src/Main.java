public class Main {
    public static void main(String[] args) {
        System.out.println(totalMoney(4));
        System.out.println(totalMoney(10));
        System.out.println(totalMoney(20));
        System.out.println(totalMoney(1));
        System.out.println(totalMoney(1000));
    }

    public static int totalMoney(int n) {
        int div = n / 7;
        int mod = n % 7;

        return (7 * div * (7 + div)) / 2 + (mod * (2 * (div + 1) + mod - 1)) / 2;
    }
}