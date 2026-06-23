public class Main {
    public static void main(String[] args) {
        System.out.println(maxSum(new int[] {1,2,3,4,5}));
        System.out.println(maxSum(new int[] {1,1,0,1,1}));
        System.out.println(maxSum(new int[] {1,2,-1,-2,1,0,-1}));
        System.out.println(maxSum(new int[] {-100}));
    }

    public static int maxSum(int[] nums) {
        boolean[] check = new boolean[101];
        int sum = 0;
        int maxNeg = -100;

        for (int num : nums)
            if (num > 0) {
                if (!check[num]) {
                    sum += num;
                    check[num] = true;
                }
            } else if (num > maxNeg){
                maxNeg = num;
            }

        if (sum > 0) return sum;
        return maxNeg;
    }
}