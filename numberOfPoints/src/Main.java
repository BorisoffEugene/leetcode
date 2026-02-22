import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 1)
        );

        System.out.println(numberOfPoints(list));
    }

    public static int numberOfPoints(List<List<Integer>> nums) {
        int[] points = new int[101];
        int start;
        int end;
        int res = 0;

        for (List<Integer> num : nums) {
            start = num.get(0);
            end = num.get(1);
            for (int i = start; i <= end; i++)
                if (points[i] == 0) {
                    points[i] = 1;
                    res++;
                }
        }

        return res;
    }
}