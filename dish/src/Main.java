import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int MOD = 1_000_000_007;

        try (Scanner scanner = new Scanner(System.in)) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();

            if (m < 2) {
                System.out.println(0);
                return;
            }

            long first = (m * (m - 1)) % MOD;
            long other = (m * m - 3 * m + 3) % MOD;

            long base = other;
            for (int i = 1; i < n - 1; i++)
                other = (base * other) % MOD;


            long res = (first * other) % MOD;
            System.out.println(res);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}