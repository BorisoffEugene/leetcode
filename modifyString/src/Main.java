public class Main {
    public static void main(String[] args) {
        System.out.println(modifyString("?zs"));
        System.out.println(modifyString("ubv?w"));
        System.out.println(modifyString("?????"));
    }

    public static String modifyString(String s) {
        int len = s.length();
        char c;
        char prev = '-';
        char next;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            c = s.charAt(i);
            if (c == '?') {
                next = (i == len - 1) ? '-' : s.charAt(i + 1);
                prev = get_char(prev, next);
                sb.append(prev);
            } else {
                prev = c;
                sb.append(prev);
            }
        }

        return sb.toString();
    }

    public static char get_char(char prev, char next) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (c == prev || c == next) continue;
            return c;
        }

        return 'a';
    }
}