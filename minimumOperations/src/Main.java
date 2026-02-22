public class Main {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[] {1,5,0,3,5}));
        System.out.println(minimumOperations(new int[] {0}));
    }

    public static int minimumOperations(int[] nums) {
        boolean[] check = new boolean[101];
        check[0] = true;
        int res = nums.length;

        for (int num : nums)
            if (check[num]) res--; else check[num] = true;

        return res;
    }
}