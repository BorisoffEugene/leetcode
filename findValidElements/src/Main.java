import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(findValidElements(new int[] {1,2,4,2,3,2}));
        System.out.println(findValidElements(new int[] {5,5,5,5}));
    }

    public static List<Integer> findValidElements(int[] nums) {
        if (nums.length == 1) return List.of(nums[0]);

        List<Integer> res = new ArrayList<>();
        res.add(nums[0]);

        int[] maxLeft = new int[nums.length];
        maxLeft[1] = nums[0];
        int[] maxRight = new int[nums.length];
        maxRight[nums.length - 2] = nums[nums.length - 1];

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > maxLeft[i]) {
                maxLeft[i + 1] = nums[i];
                res.add(nums[i]);
            } else {
                maxLeft[i + 1] = maxLeft[i];
                if (maxRight[i] == 0) {
                    for (int j = nums.length - 3; j >= i; j--)
                        maxRight[j] = Math.max(maxRight[j + 1], nums[j + 1]);
                }

                if (nums[i] > maxRight[i])
                    res.add(nums[i]);
            }
        }

        res.add(nums[nums.length - 1]);
        return res;
    }
}