public class Main {
    public static void main(String[] args) {
        System.out.println(maxAscendingSum(new int[] {10,20,30,5,10,50}));
        System.out.println(maxAscendingSum(new int[] {10,20,30,40,50}));
        System.out.println(maxAscendingSum(new int[] {12,17,15,13,10,11,12}));
    }

    public static int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int max = sum;

        for (int i = 1; i < nums.length; i++)
            if (nums[i] > nums[i - 1])
                sum += nums[i];
            else {
                if (max < sum) max = sum;
                sum = nums[i];
            }

        if (max < sum) max = sum;

        return max;
    }
}