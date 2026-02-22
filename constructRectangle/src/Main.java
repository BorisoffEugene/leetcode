import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(4)));
        System.out.println(Arrays.toString(constructRectangle(37)));
        System.out.println(Arrays.toString(constructRectangle(122122)));
    }

    public static int[] constructRectangle(int area) {
        int[] lw = new int[2];
        lw[1] = (int)Math.sqrt(area);

        while (lw[1] > 1) {
            lw[0] = area / lw[1];
            if (lw[0] * lw[1] == area) return lw;

            lw[1]--;
        }

        lw[0] = area;
        return lw;
    }
}