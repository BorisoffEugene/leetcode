import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
        System.out.println(Arrays.toString(searchRange(new int[]{}, 0)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int idx = Arrays.binarySearch(nums, target);
        if (idx < 0) return new int[] {-1, -1};

        int left = idx - 1;
        while (left >= 0 && nums[left] == target) left--;
        left++;

        int right = idx + 1;
        while (right < nums.length && nums[right] == target) right++;
        right--;

        return new int[] {left, right};
    }
}