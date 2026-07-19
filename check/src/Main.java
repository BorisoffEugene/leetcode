public class Main {
    public static void main(String[] args) {
        System.out.println(check(new int[]{3,4,5,1,2}));
        System.out.println(check(new int[]{2,1,3,4}));
        System.out.println(check(new int[]{1,2,3}));
    }

    public static boolean check(int[] nums) {
        int len = nums.length;
        boolean isExists = false;

        for (int i = 0; i < len; i++)
            if (nums[i] > nums[(i + 1) % len]) {
                if (isExists) return false;
                isExists = true;
            }

        return true;
    }
}