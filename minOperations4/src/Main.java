public class Main {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[] {5,2,5,4,5}, 2));
        System.out.println(minOperations(new int[] {2,1,2}, 2));
        System.out.println(minOperations(new int[] {9,7,5,3}, 1));
    }

    public static int minOperations(int[] nums, int k) {
        int cnt = 0;
        boolean[] isExists = new boolean[101];
        isExists[k] = true;

        for (int n : nums) {
            if (n < k) return -1;
            if (!isExists[n]) {
                isExists[n] = true;
                cnt++;
            }
        }

        return cnt;
    }
}