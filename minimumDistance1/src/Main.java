public class Main {
    public static void main(String[] args) {
        System.out.println(minimumDistance(new int[] {1,2,1,1,3}));
        System.out.println(minimumDistance(new int[] {1,1,2,3,2,1,2}));
        System.out.println(minimumDistance(new int[] {1}));
    }

    public static int minimumDistance(int[] nums) {
        int len = nums.length;
        int min = Integer.MAX_VALUE;
        int tmp;

        for (int i = 0; i < len - 2; i++)
            for (int j = i + 1; j < len - 1; j++)
                for (int k = j + 1; k < len; k++) {
                    tmp = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                    if (tmp < min && nums[i] == nums[j] && nums[j] == nums[k]) {
                        min = tmp;
                        break;
                    }
                }

        if (min == Integer.MAX_VALUE) return -1;
        return min;
    }
}