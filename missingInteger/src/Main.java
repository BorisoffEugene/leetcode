public class Main {
    public static void main(String[] args) {
        System.out.println(missingInteger(new int[] {1,2,3,2,5}));
        System.out.println(missingInteger(new int[] {3,4,5,1,12,14,13}));
        System.out.println(missingInteger(new int[] {18,19,20,21,22,23,24,25,26,27,28,9}));
    }

    public static int missingInteger(int[] nums) {
        if (nums.length == 1) return nums[0] + 1;

        int sum = nums[0];
        int start = nums.length;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != 1) {
                start = i;
                break;
            }

            sum += nums[i];
        }

        if (start == 1) sum += 1;
        if (start == nums.length) return sum;
        if (sum > 50) return sum;

        boolean[] exists = new boolean[52];

        for (int i = start; i < nums.length; i++)
            exists[nums[i]] = true;

        for (int i = sum; i < 52; i++)
            if (!exists[i]) return i;

        return -1;
    }
}