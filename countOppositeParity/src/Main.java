import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countOppositeParity(new int[] {1,2,3,4})));
        System.out.println(Arrays.toString(countOppositeParity(new int[] {1})));
    }

    public static int[] countOppositeParity(int[] nums) {
        int oddCnt = 0;
        int evenCnt = 0;
        if ((nums[nums.length - 1] & 1) == 0) evenCnt++; else oddCnt++;
        nums[nums.length - 1] = 0;

        for (int i = nums.length - 2; i >= 0; i--)
            if ((nums[i] & 1) == 0) {
                nums[i] = oddCnt;
                evenCnt++;
            } else {
                nums[i] = evenCnt;
                oddCnt++;
            }

        return nums;
    }
}