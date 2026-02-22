import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[] {17,18,5,4,6,1})));
        System.out.println(Arrays.toString(replaceElements(new int[] {400})));
        System.out.println(Arrays.toString(replaceElements(new int[] {17,18})));
    }

    public static int[] replaceElements(int[] arr) {
        int len = arr.length;
        if (len == 1) return new int[]{-1};

        int max = arr[len -1];
        int[] res = new int[len];
        res[len - 1] = -1;
        res[len - 2] = max;

        for (int i = len - 2; i > 0; i--) {
            max = Math.max(max, arr[i]);
            res[i - 1] = max;
        }

        return res;
    }
}