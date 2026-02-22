import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[] {1,2,2,3}));
        System.out.println(isMonotonic(new int[] {6,5,4,4}));
        System.out.println(isMonotonic(new int[] {1,3,2}));
    }

    public static boolean isMonotonic(int[] nums) {
        int direct = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (!check(nums[i], nums[i + 1], direct)) return false;
            direct = getDirect(nums[i], nums[i + 1], direct);
        }

        return true;
    }

    public static boolean check(int num1, int num2, int direct) {
        if (direct == 0) return true;
        if (direct == 1 && num2 >= num1) return true;
        if (direct == -1 && num2 <= num1) return true;

        return false;
    }

    public static int getDirect(int num1, int num2, int direct) {
        if (direct != 0) return direct;
        if (num2 > num1) return 1;
        if (num2 < num1) return -1;
        return 0;
    }
}