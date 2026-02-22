public class Main {
    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[] {1,3,5,4,7}));
        System.out.println(findLengthOfLCIS(new int[] {2,2,2,2,2}));
        System.out.println(findLengthOfLCIS(new int[] {1,2,3,4,7}));
        System.out.println(findLengthOfLCIS(new int[] {2,1,3}));
    }

    public static int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int cur = 1;

        for (int i = 1; i < nums.length; i++)
            if (nums[i] > nums[i - 1])
                cur++;
            else {
                max = Math.max(max, cur);
                cur = 1;
            }

        return Math.max(max, cur);
    }
}