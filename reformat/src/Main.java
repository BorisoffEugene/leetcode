public class Main {
    public static void main(String[] args) {
        System.out.println(reformat("ab01c2"));
        System.out.println(reformat("leetcode"));
        System.out.println(reformat("1229857369"));
    }

    public static String reformat(String s) {
        if (s.length() == 1) return s;

        String alpha = s.replaceAll("[^a-z]", "");
        String digit = s.replaceAll("[^0-9]", "");


        int lenA = alpha.length();
        int lenD = digit.length();
        if (Math.abs(lenA - lenD) >= 2) return "";

        int lenM = Math.max(lenA, lenD);

        if (lenA < lenM)
            return getRes(digit, alpha, lenM);
        else if (lenD < lenM)
            return getRes(alpha, digit, lenM);

        return getRes(alpha, digit, lenM) + digit.charAt(lenM - 1);
    }

    public static String getRes(String str1, String str2, int lenM) {
        String res = "";
        for (int i = 0; i < lenM - 1; i++)
            res += Character.toString(str1.charAt(i)) + Character.toString(str2.charAt(i));

        res += str1.charAt(lenM - 1);

        return res;
    }
}