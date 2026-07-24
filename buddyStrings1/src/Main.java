public class Main {
    public static void main(String[] args) {
        System.out.println(buddyStrings("ab", "ba"));
        System.out.println(buddyStrings("ab", "ab"));
        System.out.println(buddyStrings("aa", "aa"));
    }

    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;

        char[] charS = s.toCharArray();
        if (s.equals(goal)) {
            boolean[] exists = new boolean[26];
            for (char c : charS) {
                if (exists[c - 'a']) return true;
                exists[c - 'a'] = true;
            }
            return false;
        }

        char[] charG = goal.toCharArray();
        int cnt = 0;
        char c1 = '0';
        char c2 = '0';

        for (int i = 0; i < charS.length; i++)
            if (charS[i] != charG[i]) {
                cnt++;
                if (cnt > 2) return false;
                if (cnt == 1) {
                    c1 = charS[i];
                    c2 = charG[i];
                } else if (charS[i] != c2 || charG[i] != c1)
                    return false;
            }

        return cnt == 2;
    }
}