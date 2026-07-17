import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeAnagrams(new String[] {"abba","baba","bbaa","cd","cd"}));
        System.out.println(removeAnagrams(new String[] {"a","b","c","d","e"}));
    }

    public static List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);

        for (int i = 1; i < words.length; i++)
            if (!isAnagram(res.getLast(), words[i]))
                res.add(words[i]);

        return res;
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        int[] counts = new int[26];

        for (int i = 0; i < chars1.length; i++) {
            counts[chars1[i] - 'a']++;
            counts[chars2[i] - 'a']--;
        }

        for (int count : counts)
            if (count != 0) return false;

        return true;
    }
}