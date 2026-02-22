import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(countWords(new String[] {"leetcode","is","amazing","as","is"}, new String[] {"amazing","leetcode","is"}));
        System.out.println(countWords(new String[] {"b","bb","bbb"}, new String[] {"a","aa","aaa"}));
        System.out.println(countWords(new String[] {"a","ab"}, new String[] {"a","a","a","ab"}));
    }

    public static int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words1)
            map.put(word, map.getOrDefault(word, 0) + 1);
        for (String word : words2)
            map.put(word, map.getOrDefault(word, 0) + 10000);

        int res = 0;
        for (int elm : map.values())
            if (elm == 10001) res++;

        return res;
    }
}