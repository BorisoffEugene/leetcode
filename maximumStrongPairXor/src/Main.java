public class Main {
    public static void main(String[] args) {
        System.out.println(maximumStrongPairXor(new int[] {1,2,3,4,5}));
        System.out.println(maximumStrongPairXor(new int[] {10,100}));
        System.out.println(maximumStrongPairXor(new int[] {5,6,25,30}));
    }

    public static int maximumStrongPairXor(int[] nums) {
        int max = 0;
        int end;

        boolean[] exists = new boolean[101];
        for (int num : nums)
            exists[num] = true;

        for (int num : nums) {
            if (num == 100) continue;
            end = Math.min(2 * num, 100);
            for (int i = num + 1; i <= end; i++)
                if (exists[i]) max = Math.max(max, i ^ num);
        }

        return max;
    }
}