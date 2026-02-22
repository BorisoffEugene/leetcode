public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(3));
    }



    public static boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;

        for (int i = 1; i <= 31; i++)
            if (n == (int) Math.pow(2, i)) return true;

        return false;
    }
}