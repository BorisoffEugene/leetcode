import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMissingElements(new int[] {1,4,2,5}));
        System.out.println(findMissingElements(new int[] {7,8,6,9}));
        System.out.println(findMissingElements(new int[] {5,1}));
    }

    public static List<Integer> findMissingElements(int[] nums) {
        int[] arr = new int[101];
        int max = 0;
        int min = 101;

        for(int num : nums){
            arr[num] = 1;
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        List<Integer> res = new ArrayList<>();
        for(int i = min + 1; i < max; i++)
            if (arr[i] == 0) res.add(i);

        res.sort(Comparator.naturalOrder());
        return res;
    }
}