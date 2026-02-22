public class Main {
    public static void main(String[] args) {

    }

    public static boolean canBeIncreasing(int[] nums) {
        int len = nums.length;
        if (len == 2) return true;
        boolean isFind = false;

        for (int i = 1; i < len; i++)
            if (nums[i] <= nums[i - 1]) {
                if (isFind) return false;
                isFind = true;

                if 
            }


    }
}