public class Main {
    public static void main(String[] args) {
        System.out.println(greatestLetter("lEeTcOdE"));
        System.out.println(greatestLetter("arRAzFif"));
        System.out.println(greatestLetter("AbCdEfGhIjK"));
    }

    public static String greatestLetter(String s) {
        int[] cnt = new int[26];
        char[] chars = s.toCharArray();

        for (char c : chars)
            if (c >= 'a' && c <= 'z' && (cnt[c - 'a'] == 0 || cnt[c - 'a'] == 2))
                cnt[c - 'a']++;
            else if (c >= 'A' && c <= 'Z' && (cnt[c - 'A'] == 0 || cnt[c - 'A'] == 1))
                cnt[c - 'A'] += 2;

        for (char c = 'z'; c >= 'a'; c--)
            if (cnt[c - 'a'] == 3) return String.valueOf((char)(c - 32));

        return "";
    }
}