public class Main {
    public static void main(String[] args) {
        System.out.println(majorityFrequencyGroup("aaabbbccdddde"));
        System.out.println(majorityFrequencyGroup("abcd"));
        System.out.println(majorityFrequencyGroup("pfpfgi"));
    }

    public static String majorityFrequencyGroup(String s) {
        int[] freq = new int[26];
        char[] chars = s.toCharArray();

        for (char c : chars) freq[c - 'a']++;

        int[] cnt = new int[101];
        int max = 0;
        int maxF = 0;
        for (int f : freq)
            if (f > 0) {
                cnt[f]++;
                if (max < cnt[f]) {
                    max = cnt[f];
                    maxF = f;
                }
                else if (max == cnt[f] && f > maxF)
                    maxF = f;
            }

        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++)
            if (freq[c - 'a'] == maxF)
                sb.append(c);

        return sb.toString();
    }
}