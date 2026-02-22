public class Main {
    public static void main(String[] args) {
        System.out.println(minMaxGame(new int[] {1,3,5,2,4,8,2,2}));
        System.out.println(minMaxGame(new int[] {3}));
    }

    public static int minMaxGame(int[] nums) {
        if (nums.length == 2) return Math.min(nums[0], nums[1]);
        if (nums.length == 1) return nums[0];

        int[] newNums = new int[nums.length / 2];
        int idx;
        for (int i = 0; i < newNums.length; i += 2) {
            idx = 2 * i;
            newNums[i] = Math.min(nums[idx], nums[idx + 1]);
            newNums[i + 1] = Math.max(nums[idx + 2], nums[idx + 3]);
        }

        return minMaxGame(newNums);
    }
}