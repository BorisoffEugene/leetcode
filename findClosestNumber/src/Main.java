public class Main {
    public static void main(String[] args) {
        System.out.println(findClosestNumber(new int[]{-4,-2,1,4,8}));
        System.out.println(findClosestNumber(new int[]{2,-1,1}));
        System.out.println(findClosestNumber(new int[]{-100000,-100000}));
    }

    public static int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int negMin = Integer.MIN_VALUE;
        int posMin = Integer.MAX_VALUE;

        for(int num : nums) {
            if (num == 0) return 0;

            if (Math.abs(num) <= min) {
                min = Math.abs(num);
                if (num < 0)
                    negMin = num;
                else
                    posMin = num;
            }
        }

        return (posMin == min) ? posMin : negMin;
    }
}