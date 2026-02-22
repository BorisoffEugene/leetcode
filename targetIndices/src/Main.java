import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(targetIndices(new int[]{1,2,5,2,3}, 2));
        System.out.println(targetIndices(new int[]{1,2,5,2,3}, 3));
        System.out.println(targetIndices(new int[]{1,2,5,2,3}, 6));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        int idx = 0;
        int cnt = 0;

        for (int num : nums)
            if (num < target) idx++; else if (num == target) cnt++;

        List<Integer> res = new ArrayList<>();
        for (int i = idx; i < idx + cnt; i++)
            res.add(i);

        return res;
    }
}