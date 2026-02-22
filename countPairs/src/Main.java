public class Main {
    public static void main(String[] args) {
        System.out.println(countPairs(new int[] {3,1,2,2,2,1,3}, 2));
        System.out.println(countPairs(new int[] {1,2,3,4}, 1));
    }

    public static int countPairs(int[] nums, int k) {
        int res = 0;
        int lenI = nums.length - 1;

        for (int i = 0; i < lenI; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] == nums[j] && (i*j) % k == 0) res++;

        return res;
    }
}