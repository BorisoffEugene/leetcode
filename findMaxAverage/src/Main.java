public class Main {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
        System.out.println(findMaxAverage(new int[] {5}, 1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i];

        int max = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max, sum);
        }

        return 1.0 * max / k;

    }
}