public class Main {
    public static void main(String[] args) {
        System.out.println(numPrimeArrangements(5));
        System.out.println(numPrimeArrangements(100));
    }

    public static int numPrimeArrangements(int n) {
        int MOD = 1_000_000_007;
        int cntP = 0;
        for (int i = 2; i <= n; i ++) if (isPrime(i)) cntP++;
        int cntNP = n - cntP;

        long res = 1;
        for (int i = 2; i <= cntP; i++)
            res = (res * i) % MOD;

        for (int i = 2; i <= cntNP; i++)
            res = (res * i) % MOD;

        return (int) res;
    }

    public static boolean isPrime(int num) {
        return switch (num) {
            case 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97 -> true;
            default -> false;
        };
    }
}