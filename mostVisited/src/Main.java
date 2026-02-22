import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(mostVisited(4, new int[] {1,3,1,2}));
        System.out.println(mostVisited(2, new int[] {2,1,2,1,2,1,2,1,2}));
        System.out.println(mostVisited(7, new int[] {1,3,5,7}));
    }

    public static List<Integer> mostVisited(int n, int[] rounds) {
        int len = rounds.length - 1;
        int[] cnt = new int[n + 1];
        cnt[rounds[0]]++;
        int max = 1;

        for (int i = 0; i < len; i++)
            if (rounds[i + 1] > rounds[i])
                for (int j = rounds[i] + 1; j <= rounds[i + 1]; j++) {
                    cnt[j]++;
                    if (cnt[j] > max) max = cnt[j];
                }
            else {
                for (int j = rounds[i] + 1; j <= n; j++) {
                    cnt[j]++;
                    if (cnt[j] > max) max = cnt[j];
                }
                for (int j = 1; j <= rounds[i + 1]; j++) {
                    cnt[j]++;
                    if (cnt[j] > max) max = cnt[j];
                }
            }

        List<Integer> res = new ArrayList<>();
        for(int i = 1; i < n + 1; i++)
            if (cnt[i] == max)
                res.add(i);

        return res;
    }
}