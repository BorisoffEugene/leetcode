public class Main {
    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[] {0,1,4,6,7,10}, 3));
        System.out.println(arithmeticTriplets(new int[] {4,5,6,7,8,9}, 2));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        boolean[] check = new boolean[201 + 2 * diff];
        for(int num : nums) check[num] = true;

        int res = 0;
        for (int i = 0; i < nums.length - 2; i++)
            if (check[nums[i]] && check[nums[i] + diff] && check[nums[i] + 2 * diff]) res++;

        return res;
    }
}