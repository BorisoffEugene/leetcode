public class Main {
    public static void main(String[] args) {
        System.out.println(maximumLengthSubstring("bcbbbcba"));
        System.out.println(maximumLengthSubstring("aaaa"));
    }

    public static int maximumLengthSubstring(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[26];
        int len = 0;
        int max = 0;
        int start = 0;
        int i = start;

        while (i < chars.length)
            if (freq[chars[i] - 'a'] == 2) {
                start++;
                i = start;
                max = Math.max(max, len);
                len = 0;
                freq = new int[26];
            } else {
                freq[chars[i] - 'a']++;
                len++;
                i++;
            }

        return Math.max(max, len);
    }
}