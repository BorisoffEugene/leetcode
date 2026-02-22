import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("ccc"));
    }

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = s.length();
        Character c;
        int cnt = 0;
        int val;
        int is_one = 0;

        for (int i = 0; i < len; i++) {
            c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry elm : map.entrySet()) {
            val = (int)elm.getValue();
            if (val % 2 != 0 && is_one == 0) is_one++;
            cnt += val / 2;
        }

        return cnt * 2 + is_one;
    }
}