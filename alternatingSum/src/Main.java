public class Main {
    public static void main(String[] args) {
        System.out.println(alternatingSum(new int[] {1,3,5,7}));
        System.out.println(alternatingSum(new int[] {100}));
    }

    public static int alternatingSum(int[] nums) {
        int sign = 1;
        int res = 0;

        for (int num : nums) {
            res += sign * num;
            sign = -sign;
        }

        return res;
    }
}