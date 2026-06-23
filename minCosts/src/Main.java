import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minCosts(new int[]{5, 3, 4, 1, 3, 2})));
    }

    public static int[] minCosts(int[] cost) {
        for (int i = 1; i < cost.length; i++)
            cost[i] = Math.min(cost[i - 1], cost[i]);

        return cost;
    }
}