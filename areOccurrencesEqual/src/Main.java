public class Main {
    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("abacbc"));
        System.out.println(areOccurrencesEqual("aaabb"));
    }

    public static boolean areOccurrencesEqual(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[26];

        for (char c :chars)
            freq[c - 'a']++;

        int val = freq[chars[0] - 'a'];
        for (int i = 0; i < 26; i++)
            if (freq[i] > 0 && freq[i] != val) return false;

        return true;
    }
}