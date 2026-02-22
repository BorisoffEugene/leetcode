public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(-1));
    }



    public static boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        if (n % 3 != 0) return false;

        for (int i = 1; i <= 20; i++)
            if (n == (int) Math.pow(3, i)) return true;

        return false;
    }
}