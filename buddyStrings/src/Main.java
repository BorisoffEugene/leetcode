public class Main {
    public static void main(String[] args) {
        System.out.println(buddyStrings("ab", "ba"));
        System.out.println(buddyStrings("ab", "ab"));
        System.out.println(buddyStrings("aa", "aa"));
    }

    public static boolean buddyStrings(String s, String goal) {
        int len = s.length();

        if (len == 1) return false;
        if (len != goal.length()) return false;

        int cnt = 0;
        for (int i = 0; i < len; i++)
            if (s.charAt(i) != goal.charAt(i)) {
                cnt++;
                if (cnt > 2) return false;
            }

        return cnt == 2 || cnt == 0;
    }
}