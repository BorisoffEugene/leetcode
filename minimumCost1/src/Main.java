public class Main {
    public static void main(String[] args) {
        System.out.println(minimumCost(new int[] {1,2,3,12}));
        System.out.println(minimumCost(new int[] {5,4,3}));
        System.out.println(minimumCost(new int[] {10,3,1,1}));
    }

    public static int minimumCost(int[] nums) {
        int num1 = nums[0];
        int num2 = Integer.MAX_VALUE;
        int num3 = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++)
            if (nums[i] < num2) {
                num3 = num2;
                num2 = nums[i];
            } else if (nums[i] < num3)
                num3 = nums[i];

        return num1 + num2 + num3;
    }
}