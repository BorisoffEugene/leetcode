public class Main {
    public static void main(String[] args) {
        System.out.println(countKDifference(new int[] {1,2,2,1}, 1));
        System.out.println(countKDifference(new int[] {1,3}, 3));
        System.out.println(countKDifference(new int[] {3,2,1,5,4}, 2));
    }

    public static int countKDifference(int[] nums, int k) {
        int[] exists = new int[101];
        int idx;
        int res = 0;

        for (int num : nums) {
            exists[num]++;

            idx = num - k;
            if (idx > 0 && exists[idx] > 0) res += exists[idx];

            idx = num + k;
            if (idx < 101 && exists[idx] > 0) res += exists[idx];
        }

        return res;
    }
}