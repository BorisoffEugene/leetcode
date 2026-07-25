public class Main {
    public static void main(String[] args) {
        System.out.println(distributeCandies(5, 2));
        System.out.println(distributeCandies(3, 3));
    }

    public static int distributeCandies(int n, int limit) {
        limit = limit + 1;
        int zero = c2(n);
        int one = 3 * c2(n - limit);
        int two = 3 * c2(n - 2 * limit);
        int three = c2(n - 3 * limit);

        return zero - one + two - three;
    }

    public static int c2(int k) {
        if (k < 0) return 0;
        return (k + 2) * (k + 1) / 2;
    }
}