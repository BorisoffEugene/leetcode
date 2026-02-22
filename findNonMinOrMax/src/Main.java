public class Main {
    public static void main(String[] args) {
        System.out.println(findNonMinOrMax(new int[] {3,2,1,4}));
        System.out.println(findNonMinOrMax(new int[] {1,2}));
        System.out.println(findNonMinOrMax(new int[] {2,1,3}));
        System.out.println(findNonMinOrMax(new int[] {3,30,24}));
    }

    public static int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) return -1;

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++)
            if (nums[i] > max) {
                if (max > min) return max;
                max = nums[i];
            } else if (nums[i] < min) {
                if (min < max) return min;
                min = nums[i];
            } else
                return nums[i];

        return -1;
    }
}