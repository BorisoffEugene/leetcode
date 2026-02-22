public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfTheDigitsOfHarshadNumber(18));
        System.out.println(sumOfTheDigitsOfHarshadNumber(23));
    }

    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        if (x < 10) return x;
        if (x == 100) return 1;

        int res = x / 10 + x % 10;
        return (x % res == 0) ? res : -1;
    }
}