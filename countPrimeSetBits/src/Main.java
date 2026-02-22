public class Main {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(6, 10));
        System.out.println(countPrimeSetBits(10, 15));
    }

    public static int countPrimeSetBits(int left, int right) {
        int res = 0;
        for (int num = left; num <= right; num++)
            res += checkPrime(num);

        return res;
    }

    public static int checkPrime(int num) {
        int cnt = Integer.bitCount(num);
        return switch (cnt) {
            case 2, 3, 5, 7, 11, 13, 17, 19 -> 1;
            default -> 0;
        };
    }
}