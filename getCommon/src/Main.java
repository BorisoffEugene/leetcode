import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getCommon(new int[]{1,2,3}, new int[]{2,4}));
        System.out.println(getCommon(new int[]{1,2,3,6}, new int[]{2,3,4,5}));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        for (int num : nums1)
            if (Arrays.binarySearch(nums2, num) >= 0) return num;

        return -1;
    }
}