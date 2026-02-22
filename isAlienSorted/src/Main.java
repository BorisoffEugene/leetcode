public class Main {
    private static int[] arrOrder = new int[26];

    public static void main(String[] args) {
        System.out.println(isAlienSorted(new String[] {"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
        System.out.println(isAlienSorted(new String[] {"word","world","row"}, "worldabcefghijkmnpqstuvxyz"));
        System.out.println(isAlienSorted(new String[] {"apple","app"}, "abcdefghijklmnopqrstuvwxyz"));
    }

    public static boolean isAlienSorted(String[] words, String order) {
        char[] chars = order.toCharArray();
        for (int i = 0; i < 26; i++)
            arrOrder[chars[i] - 'a'] = i;

        int len = words.length;
        for (int i = 1; i < len; i++)
            if (!checkWords(words[i - 1], words[i])) return false;

        return true;
    }

    public static boolean checkWords(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int min = Math.min(len1, len2);
        int val1;
        int val2;

        for (int i = 0; i < min; i++) {
            val1 = arrOrder[word1.charAt(i) - 'a'];
            val2 = arrOrder[word2.charAt(i) - 'a'];

            if (val1 > val2)
                return false;
            else if (val1 < val2)
                return true;
        }

        return len1 <= len2;
    }
}