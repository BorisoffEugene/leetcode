public class Main {
    public static void main(String[] args) {
        System.out.println(minimumSubarrayLength(new int[] {1,2,3}, 2));
        System.out.println(minimumSubarrayLength(new int[] {2,1,8}, 10));
        System.out.println(minimumSubarrayLength(new int[] {1,2}, 0));
    }

    public static int minimumSubarrayLength(int[] nums, int k) {
        int res = 100;
        int len = nums.length;
        int curr;
        int end;

        for (int i = 0; i < len; i++) {
            curr = 0;
            end = Math.min(len, i - 1 + res);

            for (int j = i; j < end; j++) {
                curr |= nums[j];
                if (curr >= k) {
                    res = j - i + 1;
                    break;
                }
            }
        }

        return res == 100 ? -1 : res;
    }
}