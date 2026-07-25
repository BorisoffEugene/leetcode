import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6})));
        System.out.println(Arrays.toString(relativeSortArray(new int[]{28,6,22,8,44,17}, new int[]{22,28,8,6})));
        System.out.println(Arrays.toString(relativeSortArray(new int[]{2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31}, new int[]{2,42,38,0,43,21})));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        int[] res = new int[arr1.length];
        int idx = 0;

        for (int a : arr1)
            freq[a]++;

        for (int a : arr2) {
            for (int i = 1; i <= freq[a]; i++)
                res[idx++] = a;
            freq[a] = 0;
        }

        for (int i = 0; i < 1001; i++)
            for (int j = 1; j <= freq[i]; j++)
                res[idx++] = i;

        return res;
    }
}