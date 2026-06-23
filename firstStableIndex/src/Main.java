public class Main {
    public static void main(String[] args) {
        System.out.println(firstStableIndex(new int[] {5,0,1,4}, 3));
        System.out.println(firstStableIndex(new int[] {3,2,1}, 1));
        System.out.println(firstStableIndex(new int[] {0}, 0));
    }

    public static int firstStableIndex(int[] nums, int k) {
        if (nums.length == 1) return 0;

        int[] max = new int[nums.length];
        max[0] = nums[0];

        int[] min = new int[nums.length];
        min[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--)
            min[i] = Math.min(min[i + 1], nums[i]);

        if (max[0] - min[0] <= k) return 0;

        for (int i = 1; i < nums.length; i++) {
            max[i] = Math.max(max[i - 1], nums[i]);
            if (max[i] - min[i] <= k) return i;
        }

        return -1;
    }
}