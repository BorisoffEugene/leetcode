import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createGrid(2, 3)));
        System.out.println(Arrays.toString(createGrid(3, 3)));
        System.out.println(Arrays.toString(createGrid(1, 4)));
        System.out.println(Arrays.toString(createGrid(1, 1)));
        System.out.println(Arrays.toString(createGrid(4, 1)));
    }

    public static String[] createGrid(int m, int n) {
        String[] res = new String[m];
        res[0] = ".".repeat(n);
        if (m == 1) return res;

        if (n == 1) {
            for (int i = 1; i < m; i++)
                res[i] = res[0];
            return res;
        }

        String s = "#".repeat(n - 1) + ".";
        for (int i = 1; i < m; i++)
            res[i] = s;

        return res;
    }
}