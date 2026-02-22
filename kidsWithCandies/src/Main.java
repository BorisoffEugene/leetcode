import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[] {2,3,5,1,3}, 3));
        System.out.println(kidsWithCandies(new int[] {4,2,1,1,2}, 1));
        System.out.println(kidsWithCandies(new int[] {12,1,12}, 10));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int cand : candies)
            if (cand > max) max = cand;

        List<Boolean> res = new ArrayList<>();
        for (int cand : candies)
            res.add(cand + extraCandies >= max);

        return res;
    }
}