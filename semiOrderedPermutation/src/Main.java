public class Main {
    public static void main(String[] args) {
        System.out.println(semiOrderedPermutation(new int[] {2,1,4,3}));
        System.out.println(semiOrderedPermutation(new int[] {2,4,1,3}));
        System.out.println(semiOrderedPermutation(new int[] {1,3,4,2,5}));
    }

    public static int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        if (nums[0] == 1 && nums[n - 1] == n) return 0;

        int x = -1;
        int y = -1;
        for (int i = 0; i < n; i++)
            if (nums[i] == 1) {
                x = i;
                if (y != -1) break;
            } else if (nums[i] == n) {
                y = i;
                if (x != -1) break;
            }

        if (x < y) return x + n - y - 1;
        return x + n - y - 2;
    }
}