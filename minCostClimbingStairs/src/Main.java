public class Main {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[] {10,15,20}));
        System.out.println(minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len + 1];
        dp[len] = 0;
        dp[len - 1] = cost[len - 1];

        for (int i = len - 2; i >= 0; i--)
            dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);

        return Math.min(dp[0], dp[1]);
    }
}