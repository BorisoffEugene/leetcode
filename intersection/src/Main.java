import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toSet());

        Set<Integer> set2 = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.toSet());

        set1.retainAll(set2);

        return set1.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}