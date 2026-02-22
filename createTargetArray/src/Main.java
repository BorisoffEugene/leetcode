import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createTargetArray(new int[] {0,1,2,3,4}, new int[] {0,1,2,2,1})));
        System.out.println(Arrays.toString(createTargetArray(new int[] {1,2,3,4,0}, new int[] {0,1,2,3,0})));
        System.out.println(Arrays.toString(createTargetArray(new int[] {1}, new int[] {0})));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++)
            list.add(index[i], nums[i]);

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}