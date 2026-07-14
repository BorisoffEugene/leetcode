import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasIncreasingSubarrays(List.of(2,5,7,8,9,2,3,4,3,1), 3));
        System.out.println(hasIncreasingSubarrays(List.of(1,2,3,4,4,4,4,5,6,7), 5));
        System.out.println(hasIncreasingSubarrays(List.of(6,13,-17,-20,2), 2));
        System.out.println(hasIncreasingSubarrays(List.of(5,8,-2,-1), 2));
    }

    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (k == 1) return true;

        int len = nums.size();
        int end = len - 2 * k + 1;
        int i = 1;

        while (i <= end) {
            i = check(nums, k, i);
            if (i == -1) return true;
        }

        return false;
    }

    public static int check(List<Integer> nums, int k, int start) {
        int ret = start + 1;
        int end = start + k - 1;
        for (int i = start; i < end; i++)
            if (nums.get(i) <= nums.get(i - 1)) return ret;


        start = end + 1;
        end = start + k - 1;
        for (int i = start; i < end; i++)
            if (nums.get(i) <= nums.get(i - 1)) return ret;

        return -1;
    }
}