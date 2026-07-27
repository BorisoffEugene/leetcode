import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("au"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;

        char[] chars = s.toCharArray();
        int len = chars.length;
        int max = 0;

        for (int i = 0; i < len; i++) {
            if (len - i <= max) return max;

            boolean[] exists = new boolean[95];
            int j = i;
            while (j < len && !exists[chars[j] - ' '])
                exists[chars[j++] - ' '] = true;

            max = Math.max(max, j - i);
        }

        return max;
    }
}