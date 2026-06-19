public class Main {
    public static void main(String[] args) {
        System.out.println(maximizeSum(new int[] {1,2,3,4,5}, 3));
        System.out.println(maximizeSum(new int[] {5,5,5}, 2));
    }

    public static int maximizeSum(int[] nums, int k) {
        int max = 0;
        for (int num : nums) if (num > max) max = num;

        return max * k + ((k - 1) * k) / 2;
    }
}