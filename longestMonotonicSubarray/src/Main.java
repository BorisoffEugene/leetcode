public class Main {
    public static void main(String[] args) {
        System.out.println(longestMonotonicSubarray(new int[]{1,4,3,3,2}));
        System.out.println(longestMonotonicSubarray(new int[]{3,3,3,3}));
        System.out.println(longestMonotonicSubarray(new int[]{3,2,1}));
    }

    public static int longestMonotonicSubarray(int[] nums) {
        if (nums.length == 1) return 1;

        int len = 1;
        int max = 1;
        int dir = nums[1] - nums[0];

        for (int i = 1; i < nums.length; i++)
            if (dir > 0) {
                if (nums[i] > nums[i - 1]) {
                    len++;
                    max = Math.max(max, len);
                } else if (nums[i] < nums[i - 1]) {
                    dir = -1;
                    len = 2;
                    max = Math.max(max, len);
                } else {
                    dir = 0;
                }
            } else if (dir < 0) {
                if (nums[i] < nums[i - 1]) {
                    len++;
                    max = Math.max(max, len);
                } else if (nums[i] > nums[i - 1]) {
                    dir = 1;
                    len = 2;
                    max = Math.max(max, len);
                } else {
                    dir = 0;
                }
            } else {
                if (nums[i] > nums[i - 1]) {
                    dir = 1;
                    len = 2;
                    max = Math.max(max, len);
                } else if (nums[i] < nums[i - 1]) {
                    dir = -1;
                    len = 2;
                    max = Math.max(max, len);
                }
            }

        return max;
    }
}