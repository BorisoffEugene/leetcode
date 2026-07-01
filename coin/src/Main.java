import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static long[] a;
    private static Map<Integer, Map<Long, Long>> memo;

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            long x = scanner.nextLong();

            a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = scanner.nextLong();

            memo = new HashMap<>();
            for (int i = 0; i < n; i++)
                memo.put(i, new HashMap<>());

            System.out.println(getMinCoins(n - 1, x));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static long getMinCoins(int i, long curX) {
        // 0
        if (curX == 0) return 0;

        // a[0] = 1
        if (i == 0) return curX;

        // Уже было. Возвращаем
        if (memo.get(i).containsKey(curX)) return memo.get(i).get(curX);

        long nominal = a[i];
        long count = curX / nominal;
        long remainder = curX % nominal;

        // 1. Округляем вниз
        long res = count + getMinCoins(i - 1, remainder);

        // 2. Округляем вверх
        if (remainder > 0) {
            long resWithChange = (count + 1) + getMinCoins(i - 1, nominal - remainder);
            res = Math.min(res, resWithChange);
        }

        // Сохраняем в кэш
        memo.get(i).put(curX, res);
        return res;
    }
}