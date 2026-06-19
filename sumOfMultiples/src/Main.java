public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfMultiples(15));
        System.out.println(sumOfMultiples(20));
    }

    public static int sumOfMultiples(int n) {
        int n3 = n / 3;
        int n5 = n / 5;
        int n7 = n / 7;

        int s3 = (3 * n3 * (n3 + 1)) / 2;

        int s5 = 0;
        for (int i = 1; i <= n5; i++)
            if (i % 3 != 0)
                s5 = s5 + i * 5;

        int s7 = 0;
        for (int i = 1; i <= n7; i++)
            if (i % 3 != 0 && i % 5 != 0)
                s7 = s7 + i * 7;

        return s3 + s5 + s7;
    }
}