import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
    }

    public static String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "").toUpperCase();
        int len = s.length();
        if (len <= k) return s;

        int mod = s.length() % k;
        String[] arr = Pattern.compile("(?<=\\G.{"+k+"})").split(s.substring(mod));
        String res = s.substring(0, mod);

        for (String elm : arr)
            res += (res == "" ? "" : "-") + elm;

        return res;
    }
}