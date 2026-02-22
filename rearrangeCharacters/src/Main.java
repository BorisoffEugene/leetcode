public class Main {
    public static void main(String[] args) {
        System.out.println(rearrangeCharacters("ilovecodingonleetcode", "code"));
        System.out.println(rearrangeCharacters("abcba", "abc"));
        System.out.println(rearrangeCharacters("abbaccaddaeea", "aaaaa"));
    }

    public static int rearrangeCharacters(String s, String target) {
        int lenS = s.length();
        int lenT = target.length();
        if (lenS < lenT) return 0;

        char[] charS = s.toCharArray();
        char[] charT = target.toCharArray();

        int[] freqS = new int[26];
        int[] freqT = new int[26];

        for (char c : charT)
            freqT[c - 'a']++;

        for (char c : charS)
            freqS[c - 'a']++;

        int min = Integer.MAX_VALUE;
        int val;
        for (int i = 0; i < 26; i++)
            if (freqT[i] > 0) {
                val = freqS[i] / freqT[i];
                if (val == 0) return 0;
                if (val < min) min = val;
            }

        return min;
    }
}