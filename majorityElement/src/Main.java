import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {3,2,3}));
        System.out.println(majorityElement(new int[] {1}));
        System.out.println(majorityElement(new int[] {1,2}));
    }

    public static List<Integer> majorityElement(int[] nums) {
        int target = nums.length / 3;
        int cnt;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int num : nums) {
            if (res.contains(num)) continue;
            cnt = map.getOrDefault(num, 0) + 1;
            if (cnt > target) res.add(num);
            if (res.size() == 2) break;
            map.put(num, cnt);
        }

        return res;
    }
}