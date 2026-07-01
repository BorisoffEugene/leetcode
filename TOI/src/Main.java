import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static String s;
    private static int[][] memo;

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            s = reader.readLine();

            memo = new int[n][n];
            for (int[] m : memo) {
                Arrays.fill(m, -1);
            }

            System.out.println(getMinOps(0, n - 1));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isTOI(char c) {
        return c == 'T' || c == 'O' || c == 'I';
    }

    private static int getMinOps(int L, int R) {
        // Пересеклись. 0 операций
        if (L > R) return 0;

        // Встретились. 0 или 1 операция
        if (L == R) return isTOI(s.charAt(L)) ? 0 : 1;

        // Уже считали. Возвращаем
        if (memo[L][R] != -1) return memo[L][R];


        //1. Удалить
        int delLeft = getMinOps(L + 1, R) + 1;
        int delRight = getMinOps(L, R - 1) + 1;
        int delCost = Math.min(delLeft, delRight);

        //2. Исправить
        char leftChar = s.charAt(L);
        char rightChar = s.charAt(R);
        int changeCost;

        if (leftChar == rightChar)
            changeCost = isTOI(leftChar) ? 0 : 2;
        else
            changeCost = (isTOI(leftChar) || isTOI(rightChar)) ? 1 : 2;

        changeCost += getMinOps(L + 1, R - 1);

        //3. Выбрать лучший
        memo[L][R] = Math.min(delCost, changeCost);
        return memo[L][R];
    }
}