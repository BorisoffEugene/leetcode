import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(intersection(new int[][] {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}}));
        System.out.println(intersection(new int[][] {{1,2,3},{4,5,6}}));
    }

    public static List<Integer> intersection(int[][] nums) {
        int[] cnt = new int[1001];

        for(int[] nums1 : nums)
            for(int num : nums1)
                cnt[num]++;

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 1001; i++)
            if (cnt[i] == nums.length) res.add(i);

        return res;
    }
}