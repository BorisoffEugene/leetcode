public class Main {
    public static void main(String[] args) {
        System.out.println(countQuadruplets(new int[] {1,2,3,6}));
        System.out.println(countQuadruplets(new int[] {3,3,6,4,5}));
        System.out.println(countQuadruplets(new int[] {1,1,1,3,5}));
    }

    public static int countQuadruplets(int[] nums) {
        int lenA = nums.length - 3;
        int lenB = nums.length - 2;
        int lenC  = nums.length - 1;
        int lenD = nums.length;
        int res = 0;

        for (int a = 0; a < lenA; a++)
            for (int b = a + 1; b < lenB; b++)
                for (int c = b + 1; c < lenC; c++)
                    for (int d = c + 1; d < lenD; d++)
                        if (nums[a] + nums[b] + nums[c] == nums[d])
                            res++;

        return res;
    }
}