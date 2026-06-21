public class Main {
    public static void main(String[] args) {
        System.out.println(dominantIndices(new int[] {5,4,3}));
        System.out.println(dominantIndices(new int[] {4,1,2}));
    }

    public static int dominantIndices(int[] nums) {
        int end = nums.length - 1;
        double sum = nums[end];
        int cnt = 1;
        int res = 0;

        for (int i = end - 1; i >= 0; i--) {
            if (nums[i] > sum / cnt) res++;

            cnt++;
            sum += nums[i];
        }

        return res;
    }
}