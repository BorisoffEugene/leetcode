import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(largeGroupPositions("abbxxxxzzy"));
        System.out.println(largeGroupPositions("aaa"));
        System.out.println(largeGroupPositions("abcdddeeeeaabbbcd"));
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int len = s.length();
        int cnt = 1;
        int start = 0;
        if (len < 3) return res;

        for (int i = 1; i < len; i++)
            if (s.charAt(i) == s.charAt(i - 1))
                cnt++;
            else {
                if (cnt > 2) res.add(List.of(start, start + cnt - 1));
                start = i;
                cnt = 1;
            }

        if (cnt > 2) res.add(List.of(start, start + cnt - 1));

        return res;
    }
}