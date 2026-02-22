public class Main {
    public static void main(String[] args) {
        System.out.println(returnToBoundaryCount(new int[] {2,3,-5}));
        System.out.println(returnToBoundaryCount(new int[] {3,2,-3,-4}));
    }

    public static int returnToBoundaryCount(int[] nums) {
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        int res = 0;

        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
            if (sums[i] == 0) res++;
        }

        return res;
    }
}