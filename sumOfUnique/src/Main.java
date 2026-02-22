import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfUnique(new int[] {1,2,3,2}));
        System.out.println(sumOfUnique(new int[] {1,1,1,1,1}));
        System.out.println(sumOfUnique(new int[] {1,2,3,4,5}));
    }

    public static int sumOfUnique(int[] nums) {
        int[] idx = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++)
            idx[nums[i]]++;

        int res = 0;
        for (int i = 1; i < idx.length; i++)
            if (idx[i] == 1) res += i;

        return res;
    }
}