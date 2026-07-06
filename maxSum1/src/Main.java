public class Main {
    public static void main(String[] args) {
        System.out.println(maxSum(new int[] {112,131,411}));
        System.out.println(maxSum(new int[] {2536,1613,3366,162}));
        System.out.println(maxSum(new int[] {51,71,17,24,42}));
    }

    public static int maxSum(int[] nums) {
        int[][] calc = new int[10][2];
        int maxDig;
        int res = -1;

        for (int num : nums) {
            maxDig = maxDig(num);

            if (num >= calc[maxDig][1]) {
                calc[maxDig][0] = calc[maxDig][1];
                calc[maxDig][1] = num;
                res = maxRes(res, calc[maxDig]);
            } else if (num > calc[maxDig][0]) {
                calc[maxDig][0] = num;
                res = maxRes(res, calc[maxDig]);
            }
        }

        return res;
    }

    public static int maxDig(int num) {
        int res = 1;

        while (num > 0) {
            res = Math.max(res, num % 10);
            num /= 10;
        }

        return res;
    }

    public static int maxRes(int max, int[] arr) {
        if (arr[0] == 0) return max;

        return Math.max(max, arr[0] + arr[1]);
    }
}