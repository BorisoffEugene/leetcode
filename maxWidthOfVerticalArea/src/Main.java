import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxWidthOfVerticalArea(new int[][]{{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}}));
    }

    public static int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int len = points.length - 1;
        int max = 0;

        for (int i = 0; i < len; i++)
            max = Math.max(max, points[i + 1][0] - points[i][0]);

        return max;
    }
}