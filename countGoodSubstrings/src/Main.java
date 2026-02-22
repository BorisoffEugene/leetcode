public class Main {
    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
        System.out.println(countGoodSubstrings("aababcabc"));
    }

    public static int countGoodSubstrings(String s) {
        int len = s.length() - 2;
        if (len < 1) return 0;

        int res = 0;
        int[] exists = new int[26];
        exists[s.charAt(0) - 'a']++;
        exists[s.charAt(1) - 'a']++;
        exists[s.charAt(2) - 'a']++;
        if (exists[s.charAt(0) - 'a'] == 1 && exists[s.charAt(1) - 'a'] == 1 && exists[s.charAt(2) - 'a'] == 1)
            res++;

        for (int i = 1; i < len; i++) {
            exists[s.charAt(i - 1) - 'a']--;
            exists[s.charAt(i + 2) - 'a']++;
            if (exists[s.charAt(i) - 'a'] == 1 && exists[s.charAt(i + 1) - 'a'] == 1 && exists[s.charAt(i + 2) - 'a'] == 1)
                res++;
        }

        return res;
    }
}