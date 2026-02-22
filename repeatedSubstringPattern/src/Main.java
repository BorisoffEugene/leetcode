import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
        System.out.println(repeatedSubstringPattern("aaaaa"));
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        if (len == 1) return false;

        int end = len / 2;

        for (int i = end; i >= 1; i--) {
            if (len % i != 0) continue;

            if (s.substring(0, i).repeat(len / i).equals(s)) return true;
        }

        return false;
    }
}