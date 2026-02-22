public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++)
            System.out.println(i + ": " + numberOfMatches(i));
    }

    public static int numberOfMatches(int n) {
        int mat = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                mat = mat + n;
            } else {
                n = (n - 1) / 2;
                mat = mat + n + 1;
            }
        }

        return mat;
    }
}