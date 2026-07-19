import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getLongestSubsequence(new String[] {"e","a","b"}, new int[] {0,0,1}));
        System.out.println(getLongestSubsequence(new String[] {"a","b","c","d"}, new int[] {1,0,1,1}));
    }

    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);

        for (int i = 1; i < groups.length; i++)
            if (groups[i] != groups[i - 1])
                res.add(words[i]);

        return res;
    }
}