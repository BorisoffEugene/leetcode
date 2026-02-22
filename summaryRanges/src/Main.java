import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[] {0,1,2,4,5,7}));
        System.out.println(summaryRanges(new int[] {0,2,3,4,6,8,9}));
        System.out.println(summaryRanges(new int[] {}));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) return res;

        int start = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                if (start == nums[i])
                    res.add(Integer.toString(start));
                else
                    res.add(start + "->" + nums[i]);

                break;
            }

            if (nums[i] == nums[i + 1] - 1) continue;

            if (start == nums[i])
                res.add(Integer.toString(start));
            else
                res.add(start + "->" + nums[i]);

            start = nums[i + 1];
        }

        return res;
    }
}