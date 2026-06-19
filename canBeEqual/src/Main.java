public class Main {
    public static void main(String[] args) {
        System.out.println(canBeEqual("abcd", "cdab"));
        System.out.println(canBeEqual("abcd", "dacb"));
    }

    public static boolean canBeEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        char c10 = s1.charAt(0);
        char c11 = s1.charAt(1);
        char c12 = s1.charAt(2);
        char c13 = s1.charAt(3);

        char c20 = s2.charAt(0);
        char c21 = s2.charAt(1);
        char c22 = s2.charAt(2);
        char c23 = s2.charAt(3);

        if (c12 == c20 && c11 == c21 && c10 == c22 && c13 == c23) return true;
        if (c12 == c20 && c13 == c21 && c10 == c22 && c11 == c23) return true;
        if (c10 == c20 && c13 == c21 && c12 == c22 && c11 == c23) return true;

        /*if (("" + c2 + c1 + c0 + c3).equals(s2)) return true;
        if (("" + c2 + c3 + c0 + c1).equals(s2)) return true;
        if (("" + c0 + c3 + c2 + c1).equals(s2)) return true;*/

        return false;
    }
}