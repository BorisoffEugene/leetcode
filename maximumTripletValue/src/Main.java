public class Main {
    public static void main(String[] args) {
        System.out.println(maximumTripletValue(new int[] {12,6,1,2,7}));
        System.out.println(maximumTripletValue(new int[] {1,10,3,4,19}));
        System.out.println(maximumTripletValue(new int[] {1,2,3}));
    }

    public static long maximumTripletValue(int[] nums) {
        long res = 0;
        long tmp;

        for (int i = 0; i < nums.length - 2; i++)
            for (int j = i + 1; j < nums.length - 1; j++) {
                tmp = nums[i] - nums[j];
                for (int k = j + 1; k < nums.length; k++)
                    res = Math.max(res, tmp * nums[k]);
            }

        return res;
    }
}