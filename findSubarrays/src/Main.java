import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(findSubarrays(new int[] {4,2,4}));
        System.out.println(findSubarrays(new int[] {1,2,3,4,5}));
        System.out.println(findSubarrays(new int[] {0,0,0}));
    }

    public static boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++)
            if (!set.add(nums[i] + nums[i + 1])) return true;

        return false;
    }
}