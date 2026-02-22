public class Main {
    public static void main(String[] args) {
        System.out.println(numSpecial(new int[][] {{1,0,0},{0,0,1},{1,0,0}}));
        System.out.println(numSpecial(new int[][] {{1,0,0},{0,1,0},{0,0,1}}));
        System.out.println(numSpecial(new int[][] {
                {0,0,0,0,0,0,0,0},
                {0,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {1,0,0,0,0,0,0,1},
                {0,0,0,0,0,0,1,0},
                {0,0,0,0,0,0,0,1}
        }));
    }

    public static int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] exCol = new int[n];
        boolean exOne;
        int res = 0;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] == 1) { // нашли первую единичку в строке - в любом случае надо выйти из цикла
                    if (exCol[j] == -1) { // не было единичек в столбце - смотрим - есть ли единички в строке
                        exOne = false;
                        for (int k = j + 1; k < n; k++)
                            if (mat[i][k] == 1) {exOne = true; break;}

                        if (!exOne) res++;
                    } else if (exCol[j] == 0) { // не считали единички в столбце - считаем
                        exOne = false;
                        for (int k = 0; k < m; k++)
                            if (k != i && mat[k][j] == 1) {exOne = true; break;}

                        if (!exOne) { // не было единичек в столбце
                            exCol[j] = -1;
                            // смотрим - есть ли единички в строке
                            for (int k = j + 1; k < n; k++)
                                if (mat[i][k] == 1) {exOne = true; break;}

                            if (!exOne) res++;
                        } else {
                            exCol[j] = 1;
                        }
                    }

                    break;
                }

        return res;
    }
}