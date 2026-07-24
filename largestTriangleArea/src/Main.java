public class Main {
    public static void main(String[] args) {
        System.out.println(largestTriangleArea(new int[][]{{0,0},{0,1},{1,0},{0,2},{2,0}}));
    }

    public static double largestTriangleArea(int[][] points) {
        int len = points.length;
        double res = 0.0;

        for (int i = 0; i < len - 2; i++)
            for (int j = i + 1; j < len - 1; j++)
                for (int k = j + 1; k < len; k++)
                    res = Math.max(res, 0.5 * Math.abs(
                            points[i][0] * (points[j][1] - points[k][1]) +
                            points[j][0] * (points[k][1] - points[i][1]) +
                            points[k][0] * (points[i][1] - points[j][1])
                    ));

        return res;
    }
}