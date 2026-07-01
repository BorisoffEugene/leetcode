import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int x;
            int y;
            int res = 0;
            int[][] arr = new int[n][2];

            for (int i = 0; i < n; i++) {
                x = scanner.nextInt();
                y = scanner.nextInt();
                if (x > y) {
                    arr[i][0] = x;
                    arr[i][1] = 1;
                } else
                    arr[i][0] = y;
            }

            Arrays.sort(arr, (a1, a2) -> Integer.compare(a1[0], a2[0]));

            for (int i = n - 1; i >= 0; i--)
                if (arr[i][1] == 1 && a > 0) {
                    a--;
                    res += arr[i][0];
                } else if (arr[i][1] == 0 && b > 0) {
                    b--;
                    res += arr[i][0];
                } else if (a == 0 && b ==0)
                    break;

            System.out.println(res);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}