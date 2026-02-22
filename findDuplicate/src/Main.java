public class Main {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] {1,3,4,2,2}));
        System.out.println(findDuplicate(new int[] {3,1,3,4,2}));
    }

    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        int sum = (n - 1) * n / 2;

        for (int num : nums)
            sum -= num;

        return -sum;
    }
}