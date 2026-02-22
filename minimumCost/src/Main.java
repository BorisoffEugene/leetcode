import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimumCost(new int[] {1,2,3}));
        System.out.println(minimumCost(new int[] {6,5,7,9,2,2}));
        System.out.println(minimumCost(new int[] {5,5}));
    }

    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int res = 0;
        for (int i = cost.length - 1; i >= 0; i--)
            if ((cost.length - i) % 3 != 0)
                res += cost[i];

        return res;
    }
}