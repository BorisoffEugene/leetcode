public class Main {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(45));
    }

    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] res = new int[n + 1];
        res[1] = 1;
        res[2] = 2;

        for (int i = 3; i < n + 1; i++)
            res[i] = res[i - 1] + res[i - 2];

        return res[n];
    }
}