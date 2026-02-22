public class Main {
    public static void main(String[] args) {
        System.out.println(nearestValidPoint(3, 4, new int[][] {{1,2},{3,1},{2,4},{2,3},{4,4}}));
        System.out.println(nearestValidPoint(3, 4, new int[][] {{3,4}}));
        System.out.println(nearestValidPoint(3, 4, new int[][] {{2,3}}));
    }

    public static int nearestValidPoint(int x, int y, int[][] points) {
        int len = points.length;
        int min = Integer.MAX_VALUE;
        int dist;
        int res = -1;

        for (int i = 0; i < len; i++)
            if (points[i][0] == x) {
                dist = Math.abs(points[i][1] - y);
                if (dist < min) {
                    min = dist;
                    res = i;
                }
            } else if (points[i][1] == y) {
                dist = Math.abs(points[i][0] - x);
                if (dist < min) {
                    min = dist;
                    res = i;
                }
            }

        return res;
    }
}