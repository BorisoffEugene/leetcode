public class Main {
    public static void main(String[] args) {
        System.out.println(countElements(new int[] {11,7,2,15}));
        System.out.println(countElements(new int[] {-3,3,3,90}));
    }

    public static int countElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int cntMin = 1;
        int cntMax = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                cntMax = 1;
            } else if (nums[i] == max) {
                cntMax++;
            }
            if (nums[i] < min) {
                min = nums[i];
                cntMin = 1;
            } else if (nums[i] == min) {
                cntMin++;
            }
        }

        return Math.max(0, nums.length - cntMin - cntMax);
    }
}