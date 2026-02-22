import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(distinctAverages(new int[] {4,1,4,0,3,5}));
        System.out.println(distinctAverages(new int[] {1,100}));
    }

    public static int distinctAverages(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int len2 = nums.length / 2;
        int end = nums.length - 1;
        int res = 0;

        for (int i = 0; i < len2; i++)
            if (set.add(nums[i] + nums[end - i])) res++;

        return res;
    }
}