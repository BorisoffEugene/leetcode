public class Main {
    public static void main(String[] args) {
        System.out.println(maxDivScore(new int[] {2,9,15,50}, new int[] {5,3,7,2}));
        System.out.println(maxDivScore(new int[] {4,7,9,3,9}, new int[] {5,2,3}));
    }

    public static int maxDivScore(int[] nums, int[] divisors) {
        int cnt;
        int maxCnt = Integer.MIN_VALUE;
        int res = Integer.MAX_VALUE;

        for (int div : divisors) {
            cnt = 0;

            for (int num : nums)
                if (num % div == 0)
                    cnt++;

            if (cnt > maxCnt) {
               maxCnt = cnt;
               res = div;
            } else if (cnt == maxCnt && div < res)
                res = div;
        }

        return res;
    }
}