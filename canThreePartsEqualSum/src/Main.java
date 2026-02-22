import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[] {0,2,1,-6,6,-7,9,1,2,0,1}));
        System.out.println(canThreePartsEqualSum(new int[] {0,2,1,-6,6,7,9,-1,2,0,1}));
        System.out.println(canThreePartsEqualSum(new int[] {3,3,6,5,-2,2,5,1,-9,4}));
        System.out.println(canThreePartsEqualSum(new int[] {1,-1,1,-1}));
    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        for(int i = 1; i < arr.length; i++)
            arr[i] = arr[i] + arr[i - 1];

        if (arr[arr.length - 1] % 3 != 0) return false;

        int val = arr[arr.length - 1] / 3;
        int cnt = 1;

        for (int elm : arr)
            if (elm == cnt * val) {
                if (cnt == 3) return true;
                cnt++;
            }

        return false;
    }
}