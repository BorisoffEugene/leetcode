import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String minString = Arrays.stream(strs).min(Comparator.comparingInt(String::length)).get();
        int len = minString.length();

        for (int i = len - 1; i >= 0; i--) {
            boolean contain = true;
            String substr = minString.substring(0, i + 1);
            for (String str : strs)
                if (str.indexOf(substr) != 0) {
                    contain = false;
                    break;
                }
            if (contain) return substr;
        }

        return "";
    }
}