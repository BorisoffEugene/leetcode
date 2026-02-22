import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums)
            set.add(num);

        set.add(target);

        return set.headSet(target).size();
    }
}