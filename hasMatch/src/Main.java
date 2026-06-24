public class Main {
    public static void main(String[] args) {
        System.out.println(hasMatch("leetcode", "ee*e"));
        System.out.println(hasMatch("car", "c*v"));
        System.out.println(hasMatch("luck", "u*"));
    }

    public static boolean hasMatch(String s, String p) {
        int pos = p.indexOf('*');

        if (pos == 0) return s.contains(p.substring(1));

        int len = p.length();
        if (pos == len - 1) return s.contains(p.substring(0, pos));

        String s1 = p.substring(0, pos);
        int idx = s.indexOf(s1);
        if (idx == -1) return false;

        String s2 = p.substring(pos + 1, len);
        idx = s.indexOf(s2, idx + s1.length());
        return idx > -1;
    }
}