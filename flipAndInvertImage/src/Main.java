import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][] {{1,1,0},{1,0,1},{0,0,0}})));
        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][] {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}})));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        if (image.length == 1) {image[0][0] ^= 1; return image;}

        int len = image.length;
        int half = len / 2;
        boolean isOdd = len % 2 == 1;
        int tmp;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < half; j++) {
                tmp = image[i][image.length - 1 - j] ^ 1;
                image[i][image.length - 1 - j] = image[i][j] ^ 1;
                image[i][j] = tmp;
            }
            if (isOdd) image[i][half] ^= 1;
        }

        return image;
    }
}