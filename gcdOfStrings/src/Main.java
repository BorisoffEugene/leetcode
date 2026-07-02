public class Main {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
        System.out.println(gcdOfStrings("AAAAAB", "AAA"));
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        String source;
        String check1;
        String check2;

        if (str1.length() > str2.length()) {
            source = str2;
            check1 = str1;
            check2 = str2;
        } else {
            source = str1;
            check1 = str2;
            check2 = str1;
        }

        int sourceLen = source.length();
        int checkLen1 = check1.length();
        int checkLen2 = check2.length();
        int repCnt;
        String s;

        while (!source.isEmpty()) {
            if (checkLen1 % sourceLen == 0) {
                repCnt = checkLen1 / sourceLen;
                s = source.repeat(repCnt);
                if (s.equals(check1)) return source;
            }

            while (!source.isEmpty()) {
                sourceLen--;
                source = source.substring(0, sourceLen);

                if (sourceLen > 0 && checkLen2 % sourceLen == 0) {
                    repCnt = checkLen2 / sourceLen;
                    s = source.repeat(repCnt);
                    if (s.equals(check2)) break;
                }
            }
        }

        return source;
    }
}