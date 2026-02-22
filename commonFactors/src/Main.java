public class Main {
    public static void main(String[] args) {
        System.out.println(commonFactors(12, 6));
        System.out.println(commonFactors(25, 30));
        System.out.println(commonFactors(43, 945));
        System.out.println(commonFactors(452, 392));
    }

    public static int commonFactors(int a, int b) {
        int gcd = findGCD(a, b);
        if (gcd == 1) return 1;

        int start = 2;
        int end = (int)Math.sqrt(gcd);
        int cnt = 2;
        if (end * end == gcd) cnt = 1;

        for (int i = start; i <= end; i++)
            if (a % i == 0 && b % i == 0) cnt += 2;

        return cnt;
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}