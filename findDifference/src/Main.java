import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[] {1,2,3}, new int[] {2,4,6}));
        System.out.println(findDifference(new int[] {1,2,3,3}, new int[] {1,1,2,2}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set11 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1){
            set1.add(num);
            set11.add(num);
        }

        for (int num : nums2)
            set2.add(num);

        set1.removeAll(set2);
        set2.removeAll(set11);

        List res = new ArrayList<>();
        res.add(new ArrayList<>(set1));
        res.add(new ArrayList<>(set2));

        return res;
    }
}