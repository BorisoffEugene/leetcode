import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(circularGameLosers(5, 2)));
        System.out.println(Arrays.toString(circularGameLosers(4, 4)));
    }

    public static int[] circularGameLosers(int n, int k) {
        boolean[] check = new boolean[n];

        int cnt = 1;
        int step = 1;
        int curr = 0;
        check[0] = true;

        while (true) {
            curr = (curr + step * k) % n;

            if (check[curr]) break;

            check[curr] = true;
            cnt++;
            step++;
        }

        int[] res = new int[n - cnt];

        int j = 0;
        for (int i = 0; i < n; i++)
            if (!check[i])
                res[j++] = i + 1;

        return res;
    }
}