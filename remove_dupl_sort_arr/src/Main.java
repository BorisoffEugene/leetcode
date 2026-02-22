import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums)
            set.add(num);

        int i = 0;
        for(Integer element : set)
            nums[i++] = element;

        return set.size();
    }
}