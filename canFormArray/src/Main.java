import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(canFormArray(new int[]{15,88}, new int[][]{{88},{15}}));
        System.out.println(canFormArray(new int[]{49,18,16}, new int[][]{{16,18,49}}));
        System.out.println(canFormArray(new int[]{91,4,64,78}, new int[][]{{78},{4,64},{91}}));
    }

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        int[][] exists = new int[101][100];

        for (var p : pieces)
            exists[p[0]] = p;

        int i = 0;
        int[] tmp;
        while (i < arr.length) {
            tmp = exists[arr[i]];

            for (int num : tmp) {
                if (num != arr[i]) return false;
                i++;
            }
        }

        return true;
    }
}