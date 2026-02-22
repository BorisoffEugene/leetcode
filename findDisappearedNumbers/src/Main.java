import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[] {1,1}));
        System.out.println(findDisappearedNumbers(new int[] {1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] idx = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++)
            idx[nums[i]] = 1;

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < idx.length; i++)
            if (idx[i] == 0)
                list.add(i);

        return list;
    }
}