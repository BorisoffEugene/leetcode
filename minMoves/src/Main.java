public class Main {
    public static void main(String[] args) {
        System.out.println(minMoves(new int[] {2,1,3}));
        System.out.println(minMoves(new int[] {4,4,5}));
    }

    public static int minMoves(int[] nums) {
        int max = nums[0];
        int sum = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                sum = sum + i * (nums[i] - max);
                max = nums[i];
            } else {
                sum += (max - nums[i]);
            }
        }

        return sum;
    }
}