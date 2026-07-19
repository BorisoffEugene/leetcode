public class Main {
    public static void main(String[] args) {
        System.out.println(countHillValley(new int[] {2,4,1,1,6,5}));
        System.out.println(countHillValley(new int[] {6,6,5,5,4,1}));
    }

    public static int countHillValley(int[] nums) {
        int cnt = 0;
        int prev = nums[0];

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) continue;

            if ((nums[i] > prev && nums[i] > nums[i + 1]) || (nums[i] < prev && nums[i] < nums[i + 1]))
                cnt++;

            prev = nums[i];
        }

        return cnt;
    }
}