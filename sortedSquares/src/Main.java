import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[] {-4,-2, -2, -2, -2, -2,-1,0,3,10})));
        System.out.println(Arrays.toString(sortedSquares(new int[] {-7,-3,2,3,11})));
    }

    public static int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] res = new int[end + 1];
        int endSq;
        int startSq;
        int resIdx = end;

        while (resIdx >= 0) {
            if (nums[start] >= 0) {
                for (int i = start; i <= end; i++)
                    res[i - start] = nums[i] * nums[i];

                break;
            }

            if (nums[end] < 0) {
                for (int i = start; i <= end; i++)
                    res[end - i] = nums[i] * nums[i];
                break;
            }

            endSq = nums[end] * nums[end];
            startSq = nums[start] * nums[start];

            if (endSq > startSq) {
                 res[resIdx] = endSq;
                 end--;
            } else {
                 res[resIdx] = startSq;
                 start++;
            }

            resIdx--;
        }

        return res;
    }
}