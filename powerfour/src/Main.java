public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(1));
    }



    public static boolean isPowerOfFour(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        if (n % 4 != 0) return false;

        for (int i = 1; i <= 16; i++)
            if (n == (int) Math.pow(4, i)) return true;

        return false;
    }
}