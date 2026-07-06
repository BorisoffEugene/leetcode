public class Main {
    public static void main(String[] args) {
        System.out.println(isMiddleElementUnique(new int[] {1,2,3}));
        System.out.println(isMiddleElementUnique(new int[] {1,2,2}));
    }

    public static boolean isMiddleElementUnique(int[] nums) {
        int idx = nums.length / 2;
        int val = nums[idx];

        for (int i = 0; i < idx; i++)
            if (nums[i] == val) return false;

        for (int i = idx + 1; i < nums.length; i++)
            if (nums[i] == val) return false;

        return true;
    }
}