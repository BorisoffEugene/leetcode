public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfSquares(new int[] {1,2,3,4}));
        System.out.println(sumOfSquares(new int[] {2,7,1,19,18,3}));
    }

    public static int sumOfSquares(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0]*nums[0];
        if (len == 2) return nums[0]*nums[0] + nums[1]*nums[1];

        int res = nums[0]*nums[0] + nums[len - 1] * nums[len - 1];
        int sqrt = (int)Math.sqrt(len);

        int idx = 2;
        int idx2;
        while (idx <= sqrt) {
            if (len % idx == 0) {
                res += nums[idx-1] * nums[idx-1];
                idx2 = len / idx;
                if (idx2 != idx) res += nums[idx2-1] * nums[idx2-1];
            }

            idx++;
        }

        return res;
    }
}