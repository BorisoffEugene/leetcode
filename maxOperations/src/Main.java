public class Main {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[] {3,2,1,4,5}));
        System.out.println(maxOperations(new int[] {5,3}));
    }

    public static int maxOperations(int[] nums) {
        int score = nums[0] + nums[1];
        int res = 1;

        for (int i = 2; i < nums.length - 1; i+=2)
            if (nums[i] + nums[i + 1] == score)
                res++;
            else
                break;

        return res;
    }
}