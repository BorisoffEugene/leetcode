import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(imageSmoother(new int[][]{{100,200,100},{200,50,200},{100,200,100}})));
    }

    public static int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int m_1 = m - 1;
        int n_1 = n - 1;
        int m_2 = m - 2;
        int n_2 = n - 2;

        //одна клетка
        if (m == 1 && n == 1) return img;

        int[][] res = new int[m][n];

        // одна строка
        if (m == 1) {
            // углы
            res[0][0] = (img[0][0] + img[0][1]) / 2;
            res[0][n_1] = (img[0][n_1] + img[0][n_2]) / 2;
            // линия
            for (int i = 1; i < n_1; i++)
                res[0][i] = (img[0][i - 1] + img[0][i] + img[0][i + 1]) / 3;

            return res;
        }

        // один столбец
        if (n == 1) {
            // углы
            res[0][0] = (img[0][0] + img[1][0]) / 2;
            res[m_1][0] = (img[m_1][0] + img[m_2][0]) / 2;
            // линия
            for (int i = 1; i < m_1; i++)
                res[i][0] = (img[i - 1][0] + img[i][0] + img[i + 1][0]) / 3;

            return res;
        }

        // углы
        res[0][0] = (img[0][0] + img[0][1] + img[1][1] + img[1][0]) / 4;
        res[m_1][0] = (img[m_1][0] + img[m_1][1] + img[m_2][1] + img[m_2][0]) / 4;
        res[m_1][n_1] = (img[m_1][n_1] + img[m_1][n_2] + img[m_2][n_1] + img[m_2][n_2]) / 4;
        res[0][n_1] = (img[0][n_1] + img[0][n_2] + img[1][n_1] + img[1][n_2]) / 4;

        // линии
        for (int i = 1; i < n_1; i++)
            res[0][i] = (img[0][i - 1] + img[0][i] + img[0][i + 1] + img[1][i - 1] + img[1][i] + img[1][i + 1]) / 6;
        for (int i = 1; i < n_1; i++)
            res[m_1][i] = (img[m_1][i - 1] + img[m_1][i] + img[m_1][i + 1] + img[m_2][i - 1] + img[m_2][i] + img[m_2][i + 1]) / 6;
        for (int i = 1; i < m_1; i++)
            res[i][0] = (img[i - 1][0] + img[i][0] + img[i + 1][0] + img[i - 1][1] + img[i][1] + img[i + 1][1]) / 6;
        for (int i = 1; i < m_1; i++)
            res[i][n_1] = (img[i - 1][n_1]+ img[i][n_1] + img[i + 1][n_1] + img[i - 1][n_2] + img[i][n_2] + img[i + 1][n_2]) / 6;

        // внутренности
        for (int i = 1; i < m_1; i++)
            for (int j = 1; j < n_1; j++)
                res[i][j] = (img[i - 1][j - 1] + img[i - 1][j] + img[i - 1][j + 1] + img[i][j - 1] + img[i][j] + img[i][j + 1] + img[i + 1][j - 1] + img[i + 1][j] + img[i + 1][j + 1]) / 9;

        return res;
    }
}