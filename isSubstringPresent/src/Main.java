public class Main {
    public static void main(String[] args) {
        System.out.println(isSubstringPresent("leetcode"));
        System.out.println(isSubstringPresent("abcba"));
        System.out.println(isSubstringPresent("abcd"));
    }

    public static boolean isSubstringPresent(String s) {
        int len = s.length();

        for (int i = 0; i < len - 1; i++)
            for (int j = len - 1; j > 0; j --)
                if (s.charAt(i) == s.charAt(j) && s.charAt(i + 1) == s.charAt(j - 1)) return true;

        return false;
    }
}