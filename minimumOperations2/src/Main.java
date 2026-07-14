public class Main {
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[] {1,2,3,4,2,3,3,5,7}));
        System.out.println(minimumOperations(new int[] {4,5,6,4,4}));
        System.out.println(minimumOperations(new int[] {6,7,8,9}));
    }

    public static int minimumOperations(int[] nums) {
        boolean[] check = new boolean[101];
        int cnt = 0;

        for (int i = nums.length - 1; i >= 0; i--)
            if (!check[nums[i]])
                check[nums[i]] = true;
            else {
                cnt = i + 1;
                break;
            }

        int div = cnt / 3;
        int mod = cnt % 3;

        if (mod == 0) return div;
        return div + 1;
    }
}