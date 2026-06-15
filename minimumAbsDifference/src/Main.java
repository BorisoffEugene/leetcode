import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[] {4,2,1,3}));
        System.out.println(minimumAbsDifference(new int[] {1,3,6,10,15}));
        System.out.println(minimumAbsDifference(new int[] {3,8,-10,23,19,-4,-14,27}));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++)
            if (arr[i] - arr[i - 1] < diff) {
                res.clear();
                res.add(List.of(arr[i - 1], arr[i]));
                diff = arr[i] - arr[i - 1];
            } else if (arr[i] - arr[i - 1] == diff)
                res.add(List.of(arr[i - 1], arr[i]));

        return res;
    }
}