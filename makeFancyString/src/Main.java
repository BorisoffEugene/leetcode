public class Main {
    public static void main(String[] args) {
        System.out.println(makeFancyString("leeetcode"));
        System.out.println(makeFancyString("aaabaaaa"));
        System.out.println(makeFancyString("aab"));
    }

    public static String makeFancyString(String s) {
        int len = s.length();
        char curChar = s.charAt(0);
        int cnt = 1;
        char c;
        StringBuilder sb = new StringBuilder();
        sb.append(curChar);

        for (int i = 1; i < len; i++) {
            c = s.charAt(i);
            if (c == curChar) {
                cnt++;
                if (cnt < 3) sb.append(s.charAt(i));
            } else {
                cnt = 1;
                curChar = c;
                sb.append(c);
            }
        }

        return sb.toString();
    }
}