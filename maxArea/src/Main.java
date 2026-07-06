public class Main {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[] {1,1}));
    }

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        int tmp;

        while (start < end) {
            if (height[start] < height[end]) {
                tmp = height[start] * (end - start);
                start++;
            } else {
                tmp = height[end] * (end - start);
                end--;
            }

            if (tmp > max) max = tmp;
        }

        return max;
    }
}