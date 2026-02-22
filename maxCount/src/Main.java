public class Main {
    public static void main(String[] args) {
        System.out.println(maxCount(3, 3, new int[][] {{2,2},{3,3}}));
        System.out.println(maxCount(3, 3, new int[][] {{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3}}));
        System.out.println(maxCount(3, 3, new int[][] {}));
    }

    public static int maxCount(int m, int n, int[][] ops) {
        int minA = m;
        int minB = n;

        for (int[] op : ops) {
            if (minA > op[0]) minA = op[0];
            if (minB > op[1]) minB = op[1];
        }

        return minA * minB;
    }
}