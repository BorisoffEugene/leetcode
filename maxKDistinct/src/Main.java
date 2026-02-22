import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxKDistinct(new int[] {84,93,100,77,90}, 3)));
        System.out.println(Arrays.toString(maxKDistinct(new int[] {84,93,100,77,93}, 3)));
        System.out.println(Arrays.toString(maxKDistinct(new int[] {1,1,1,2,2,2}, 6)));
    }

    public static int[] maxKDistinct(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int num : nums)
            set.add(num);

        int len = Math.min(k, set.size());
        int[] res = new int[len];
        int idx = 0;

        for (int elm : set) {
            res[idx++] = elm;
            if (idx == len) break;
        }

        return res;
    }
}