import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[] {1,7,3,6,5,6}));
        System.out.println(pivotIndex(new int[] {1,2,3}));
        System.out.println(pivotIndex(new int[] {2,1,-1}));
        System.out.println(pivotIndex(new int[] {0,0}));
        System.out.println(pivotIndex(new int[] {-1,-1,0,1,-1,-1}));
    }

    public static int pivotIndex(int[] nums) {
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];
        Arrays.fill(sumLeft, Integer.MAX_VALUE);
        Arrays.fill(sumRight, Integer.MAX_VALUE);
        sumRight[nums.length - 1] = 0;
        sumLeft[0] = 0;

        for (int i = 1; i < nums.length; i++) {
            sumRight[nums.length - 1 - i] = sumRight[nums.length - i] + nums[nums.length - i];
        }

        if (sumRight[0] == 0) return 0;


        for (int i = 1; i < nums.length; i++) {
            sumLeft[i] = sumLeft[i - 1] + nums[i - 1];
            if (sumLeft[i] == sumRight[i]) return i;
        }

        return -1;
    }
}