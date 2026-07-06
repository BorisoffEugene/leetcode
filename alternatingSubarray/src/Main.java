public class Main {
    public static void main(String[] args) {
        System.out.println(alternatingSubarray(new int[] {2,3,4,3,4}));
        System.out.println(alternatingSubarray(new int[] {4,5,6}));
        System.out.println(alternatingSubarray(new int[] {21,9,5}));
        System.out.println(alternatingSubarray(new int[] {13,14,15,14}));
    }

    public static int alternatingSubarray(int[] nums) {
        int max = 1;
        int len;
        int kef = 1;

        for (int i = 0; i < nums.length - max; i++)
            if (nums[i + 1] - nums[i] == kef) {
                len = 2;
                kef = -kef;

                while (i + len < nums.length && nums[i + len] - nums[i + len - 1] == kef) {
                    len++;
                    kef = -kef;
                }

                kef = 1;
                if (max < len) max = len;
            }

        return max < 2 ? -1 : max;
    }
}