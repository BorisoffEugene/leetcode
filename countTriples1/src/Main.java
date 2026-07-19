public class Main {
    public static void main(String[] args) {
        System.out.println(countTriples(5));
        System.out.println(countTriples(10));
        System.out.println(countTriples(1));
        System.out.println(countTriples(250));
    }

    public static int countTriples(int n) {
        int maxSqr = n * n;
        int aSqr;
        int sumSqr;
        int c;
        int res = 0;

        for (int a = 1; a <= n; a++) {
            aSqr = a * a;
            for (int b = a + 1; b <= n; b++) {
                sumSqr = aSqr + b * b;
                if (sumSqr > maxSqr) break;

                c = (int)Math.sqrt(sumSqr);
                if (sumSqr == c * c) res++;
            }
        }

        return 2 * res;
    }
}