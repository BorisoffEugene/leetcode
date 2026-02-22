import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(addedInteger(new int[] {2,6,4}, new int[] {9,7,5}));
        System.out.println(addedInteger(new int[] {10}, new int[] {5}));
        System.out.println(addedInteger(new int[] {1,1,1,1}, new int[] {1,1,1,1}));
    }

    public static int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        return nums2[0] - nums1[0];
    }
}