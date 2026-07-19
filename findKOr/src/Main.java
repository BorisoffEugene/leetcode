public class Main {
    public static void main(String[] args) {
        System.out.println(findKOr(new int[] {7,12,9,8,9,15}, 4));
        System.out.println(findKOr(new int[] {2,12,1,11,4,5}, 6));
        System.out.println(findKOr(new int[] {10,8,5,9,11,6,8}, 1));
    }

    public static int findKOr(int[] nums, int k) {
        int cnt;
        int res = 0;

        for (int i = 0; i < 31; i++) {
            cnt = 0;
            for (int num : nums)
                if ((num >> i & 1) == 1) {
                    if (cnt == k - 1) {
                        res |= (1 << i);
                        break;
                    }
                    cnt++;
                }
        }

        return res;
    }
}