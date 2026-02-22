import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[] {1,2,2,4})));
        System.out.println(Arrays.toString(findErrorNums(new int[] {1,1})));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] idx = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++)
            idx[nums[i]] += 1;

        int[] res = new int[2];
        int cntExit = 0;

        for (int i = 1; i < idx.length; i++) {
            if (idx[i] == 1) continue;

            res[idx[i] == 2 ? 0 : 1] = i;
            cntExit++;
            if (cntExit == 2) break;
        }

        return res;
    }
}