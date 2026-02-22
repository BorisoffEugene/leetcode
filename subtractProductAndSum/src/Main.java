public class Main {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
        System.out.println(subtractProductAndSum(9999));
    }

    public static int subtractProductAndSum(int n) {
        if (n < 10) return 0;

        int prod = 1;
        int sum = 0;
        int val;

        while (n > 0) {
            val = n % 10;
            prod *= val;
            sum += val;
            n /= 10;
        }

        return prod - sum;
    }
}