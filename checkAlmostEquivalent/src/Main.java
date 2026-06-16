public class Main {
    public static void main(String[] args) {
        System.out.println(checkAlmostEquivalent("aaaa", "bccb"));
        System.out.println(checkAlmostEquivalent("abcdeef", "abaaacc"));
        System.out.println(checkAlmostEquivalent("cccddabba", "babababab"));
    }

    public static boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int len = word1.length();

        for (int i = 0; i < len; i++) {
            freq1[word1.charAt(i) - 'a']++;
            freq2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++)
            if (Math.abs(freq1[i] - freq2[i]) > 3) return false;

        return true;
    }
}