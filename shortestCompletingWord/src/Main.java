public class Main {
    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("1s3 PSt", new String[] {"step","steps","stripe","stepple"}));
        System.out.println(shortestCompletingWord("1s3 456", new String[] {"looks","pest","stew","show"}));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        int min = 16;
        String res = "";
        int[] freqLP = new int[26];
        char[] chars = licensePlate.toLowerCase().toCharArray();

        for (char c : chars)
            if ("0123456789 ".indexOf(c) == -1)
                freqLP[c - 'a']++;

        for (String word : words)
            if (check(freqLP, word, min)) {
                min = word.length();
                res = word;
            }

        return res;
    }

    public static boolean check(int[] freqLP, String word, int min) {
        if (word.length() >= min) return false;

        int[] freq = new int[26];
        char[] chars = word.toCharArray();

        for (char c : chars)
            freq[c - 'a']++;

        for (int i = 0; i < 26; i++)
            if (freq[i] < freqLP[i]) return false;

        return true;
    }
}