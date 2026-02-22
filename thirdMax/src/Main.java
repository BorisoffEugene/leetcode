import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[] {3,2,1}));
        System.out.println(thirdMax(new int[] {1,2}));
        System.out.println(thirdMax(new int[] {2,2,3,1}));
    }

    public static int thirdMax(int[] nums) {
        Set<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        int max = Collections.max(list);
        list.remove(Integer.valueOf(max));
        if (list.isEmpty()) return max;

        int res =  Collections.max(list);
        list.remove(Integer.valueOf(res));
        if (list.isEmpty()) return max;

        res =  Collections.max(list);
        return res;
    }
}