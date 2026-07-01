import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2)));
        System.out.println(Arrays.deepToString(floodFill(new int[][]{{0,0,0},{0,0,0}}, 0, 0, 0)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public static void fill(int[][] image, int sr, int sc, int color, int oldColor) {
        if (sr < 0 || sr >= image.length) return;
        if (sc < 0 || sc >= image[0].length) return;
        if (image[sr][sc] == color) return;
        if (image[sr][sc] != oldColor) return;

        image[sr][sc] = color;
        fill(image, sr - 1, sc, color, oldColor);
        fill(image, sr + 1, sc, color, oldColor);
        fill(image, sr, sc - 1, color, oldColor);
        fill(image, sr, sc + 1, color, oldColor);
    }
}