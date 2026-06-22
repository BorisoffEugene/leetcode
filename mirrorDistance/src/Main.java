public class Main {
    public static void main(String[] args) {
        System.out.println(mirrorDistance(25));
        System.out.println(mirrorDistance(10));
        System.out.println(mirrorDistance(7));
    }

    public static int mirrorDistance(int n) {
        int num1 = n;
        int num2 = 0;

        while (n > 0) {
            num2 = num2 * 10 + n % 10;
            n /= 10;
        }

        return Math.abs(num2 - num1);
    }
}