import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(findTheDistanceValue(new int[] {4,5,8}, new int[] {10,9,1,8}, 2));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);

        int res = 0;
        for (int x : arr1) {
            int idx = Arrays.binarySearch(arr2, x - d);
            if (idx < 0) idx = -idx - 1;
            if (idx >= arr2.length || arr2[idx] > x + d) res++;
        }

        return res;
    }
}