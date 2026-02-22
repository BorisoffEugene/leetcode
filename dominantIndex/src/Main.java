public class Main {
    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[] {3,6,1,0}));
        System.out.println(dominantIndex(new int[] {1,2,3,4}));
    }

    public static int dominantIndex(int[] nums) {
        int prevMax = Integer.MIN_VALUE;
        int maxI = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxI]) {
                prevMax = nums[maxI];
                maxI = i;
            } else if (nums[i] > prevMax) {
                prevMax = nums[i];
            }
        }

        if (nums[maxI] >= 2 * prevMax) return maxI; else return -1;
    }
}