public class Main {
    public static void main(String[] args) {
        System.out.println(countTriples(5));
        System.out.println(countTriples(10));
        System.out.println(countTriples(1));
        System.out.println(countTriples(250));
    }

    public static int countTriples(int n) {
        int a = 1;
        int b = n - 1;
        int res = 0;
        int n2 = n*n;

        while (b > 1 && b > a) {
            if ((a*a + b*b) <= n2) res +=2;
            b--;
            a++;
        }

        return res;
    }
}