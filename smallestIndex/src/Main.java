public class Main {
    public static void main(String[] args) {
        System.out.println(smallestIndex(new int[] {1,3,2}));
        System.out.println(smallestIndex(new int[] {1,10,11}));
        System.out.println(smallestIndex(new int[] {1,2,3}));
    }

    public static int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (checkSum(nums[i], i)) return i;

        return -1;
    }

    public static boolean checkSum(int num, int idx) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            if (sum > idx) return false;
            num /= 10;
        }

        return sum == idx;
    }
}