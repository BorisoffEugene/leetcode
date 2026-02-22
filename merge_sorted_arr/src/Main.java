import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
        merge(new int[] {1}, 1, new int[] {}, 0);
        merge(new int[] {0}, 0, new int[] {1}, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}