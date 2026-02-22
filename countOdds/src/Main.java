public class Main {
    public static void main(String[] args) {
        System.out.println(countOdds(3, 7));
        System.out.println(countOdds(8, 10));
        System.out.println(countOdds(7, 11));
    }

    public static int countOdds(int low, int high) {
        if (low == high && high % 2 != 0) return 1;

        if (low == high) return 0;

        if ((high - low + 1) % 2 == 0) return (high - low + 1) / 2;

        if (high % 2 == 0) return (high - low + 2) / 2 - 1;

        return (high - low + 2) / 2;
    }
}