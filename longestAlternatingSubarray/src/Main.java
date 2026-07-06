public class Main {
    public static void main(String[] args) {
        System.out.println(longestAlternatingSubarray(new int[] {3,2,5,4}, 5));
        System.out.println(longestAlternatingSubarray(new int[] {1,2}, 2));
        System.out.println(longestAlternatingSubarray(new int[] {2,3,4,5}, 4));
        System.out.println(longestAlternatingSubarray(new int[] {4,10,3}, 10));
    }

    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = 0;
        int len;

        for (int i = 0; i < nums.length - max; i++)
            if ((nums[i] & 1) == 0 && nums[i] <= threshold) {
                len = 1;
                while (
                        i + len < nums.length &&
                        nums[i + len] <= threshold &&
                        (nums[i + len - 1] & 1) != (nums[i + len] & 1)
                )
                    len++;

                if (max < len) max = len;
            }

        return max;
    }
}