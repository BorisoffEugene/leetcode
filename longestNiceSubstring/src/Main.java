public class Main {
    public static void main(String[] args) {
        System.out.println(longestNiceSubstring("YazaAay"));
        System.out.println(longestNiceSubstring("Bb"));
        System.out.println(longestNiceSubstring("c"));
    }

    public static String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";

        int idx = getNotNice(s);
        if (idx == -1) return s;

        String left = longestNiceSubstring(s.substring(0, idx));
        String right = longestNiceSubstring(s.substring(idx + 1));

        return left.length() >= right.length() ? left : right;
    }

    public static int getNotNice(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[26];

        for (char c : chars)
            freq[(c & 0xDF) - 'A'] |= (((c - 'a') >>> 31) + 1);

        for (int i = 0; i < chars.length; i++)
            if (freq[(chars[i] & 0xDF) - 'A'] != 3) return i;

        return -1;
    }
}