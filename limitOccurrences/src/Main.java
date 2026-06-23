import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(limitOccurrences(new int[] {1,1,1,2,2,3}, 2)));
        System.out.println(Arrays.toString(limitOccurrences(new int[] {1,2,3}, 1)));
        System.out.println(Arrays.toString(limitOccurrences(new int[] {5,5}, 1)));
    }

    public static int[] limitOccurrences(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();

        int cur = nums[0];
        int cnt = 1;
        list.add(cur);

        for (int i = 1; i < nums.length; i++)
            if (nums[i] == cur) {
                cnt++;
                if (cnt > k) {
                    while (i < nums.length && nums[i] == cur) {
                        i++;
                    }
                    if (i == nums.length) break;
                    cur = nums[i];
                    cnt = 1;
                    list.add(cur);
                } else {
                    list.add(cur);
                }
            } else {
                cur = nums[i];
                cnt = 1;
                list.add(cur);
            }

        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = list.get(i);

        return res;
    }
}