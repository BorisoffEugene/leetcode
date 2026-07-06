import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(lastVisitedIntegers(new int[] {1,2,-1,-1,-1}));
        System.out.println(lastVisitedIntegers(new int[] {1,-1,2,-1,-1}));
    }

    public static List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int cnt = 0;
        int len;

        for (int num : nums)
            if (num == -1) {
                len = seen.size();
                if (cnt >= len)
                    ans.add(-1);
                else
                    ans.add(seen.get(len - 1 - cnt));

                cnt++;
            } else {
                cnt = 0;
                seen.add(num);
            }

        return ans;
    }
}