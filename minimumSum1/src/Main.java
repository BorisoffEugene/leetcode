public class Main {
    public static void main(String[] args) {
        System.out.println(minimumSum(new int[] {8,6,1,5,3}));
        System.out.println(minimumSum(new int[] {5,4,8,7,10,2}));
        System.out.println(minimumSum(new int[] {6,5,4,3,4,5}));
    }

    public static int minimumSum(int[] nums) {
        int res = 151;
        int tmp;

        for (int i = 0; i < nums.length - 2; i++)
            for (int j = i + 1; j < nums.length - 1; j++)
                for (int k = j + 1; k < nums.length; k++) {
                    tmp = nums[i] + nums[j] + nums[k];
                    if (nums[j] > nums[i] && nums[j] > nums[k] && tmp < res)
                        res = tmp;
                }

        return res == 151 ? -1 : res;
    }
}