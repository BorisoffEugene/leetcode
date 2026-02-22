import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
        System.out.println(heightChecker(new int[]{5,1,2,3,4}));
        System.out.println(heightChecker(new int[]{1,2,3,4,5}));
    }

    public static int heightChecker(int[] heights) {
        int[] sortHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortHeights);
        int res = 0;

        for (int i = 0; i < heights.length; i++)
            if (heights[i] != sortHeights[i]) res++;

        return res;
    }
}