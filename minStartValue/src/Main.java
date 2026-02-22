public class Main {
    public static void main(String[] args) {
        System.out.println(minStartValue(new int[] {-3,2,-3,4,2}));
        System.out.println(minStartValue(new int[] {1,2}));
        System.out.println(minStartValue(new int[] {1,-2,-3}));
    }

    public static int minStartValue(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            minSum = Math.min(minSum, sum);
        }

        return Math.max(1 - minSum, 1);
    }
}