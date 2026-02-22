import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(isAcronym(Arrays.asList(new String[] {"alice","bob","charlie"}), "abc"));
        System.out.println(isAcronym(Arrays.asList(new String[] {"alice","bob","charlie"}), "abcd"));
        System.out.println(isAcronym(Arrays.asList(new String[] {"an","apple"}), "a"));
        System.out.println(isAcronym(Arrays.asList(new String[] {"never","gonna","give","up","on","you"}), "ngguoy"));
    }

    public static boolean isAcronym(List<String> words, String s) {
        int idx = 0;
        int len = s.length();

        for (String word : words) {
            if (idx == len) return false;
            if (word.charAt(0) != s.charAt(idx)) return false;
            idx++;
        }

        return idx == len;
    }
}