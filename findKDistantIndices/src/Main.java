import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(findKDistantIndices(new int[] {3,4,9,1,3,9,5}, 9, 1));
        System.out.println(findKDistantIndices(new int[] {2,2,2,2,2}, 2, 2));
        System.out.println(findKDistantIndices(new int[] {222,151,842,244,103,736,219,432,565,216,36,198,10,367,778,111,307,460,92,622,750,36,559,983,782,432,312,111,676,179,44,86,766,371,746,905,850,170,892,80,449,932,295,875,259,556,730,441,153,869}, 153, 19));
    }

    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int start;
        int end;
        TreeSet<Integer> res = new TreeSet<>();

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == key) {
                start = Math.max(0, i - k);
                end = Math.min(nums.length - 1, i + k);

                for (int j = start; j <= end; j++)
                    res.add(j);
            }



        return new ArrayList<>(res);
    }
}