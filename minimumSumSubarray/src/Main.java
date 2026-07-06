import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimumSumSubarray(List.of(3, -2, 1, 4), 2, 3));
        System.out.println(minimumSumSubarray(List.of(-2, 2, -3, 1), 2, 3));
        System.out.println(minimumSumSubarray(List.of(1, 2, 3, 4), 2, 4));
    }

    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int len = nums.size();
        int sum = Integer.MAX_VALUE;

        for (int wl = l - 1; wl < r; wl++)
            for (int i = 0; i < len - wl; i++) {
                sum = calcSum(nums, i, i + wl, sum);
                if (sum == 1) return sum;
            }

        return sum == Integer.MAX_VALUE ? -1 : sum;
    }

    public static int calcSum(List<Integer> nums, int start, int end, int sum) {
        int res = 0;

        for (int i = start; i <= end; i++)
            res += nums.get(i);

        if (res < 1) return sum;

        return Math.min(res, sum);
    }
}