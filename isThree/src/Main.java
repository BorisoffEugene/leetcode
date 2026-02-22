public class Main {
    public static void main(String[] args) {
        System.out.println(isThree(21));
        System.out.println(isThree(9));
        System.out.println(isThree(81));
    }

    public static boolean isThree(int n) {
        if (n < 4) return false;
        if (n == 4) return true;
        if (n % 2 == 0) return false;

        int sqrt = (int)Math.sqrt(n);
        if (n % sqrt != 0) return false;

        int i = 3;
        while (i <= sqrt) {
            if (n % i == 0) {
                return i == sqrt;
            } else
                i += 2;
        }

        return false;
    }
}