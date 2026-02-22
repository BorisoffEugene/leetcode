public class Main {
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi(" -042"));
        System.out.println(myAtoi("1337c0d3"));
        System.out.println(myAtoi("0-1"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("+-12"));
    }

    public static int myAtoi(String s) {
        int len = s.length();
        if (len == 0) return 0;

        int c = s.charAt(0);
        if (c >= 'A' || c == '.') return 0;

        int pos = 0;
        int sign = 1;
        if (c == ' ') {
            for (int i = 1; i < len; i++) {
                c = s.charAt(i);
                if (c >= 'A' || c == '.') return 0;
                if (c == '-' || c == '+' || c >= '0') {
                    pos = i;
                    break;
                }
            }

            if (pos == 0) return 0;
        }

        if (s.charAt(pos) == '-') {sign = -1; pos++;} else if (s.charAt(pos) == '+') pos++;
        if (pos == len) return 0;

        char dig = s.charAt(pos);
        long res = 0;
        while (dig >= '0' && dig <= '9') {
            res = res * 10 + (dig - 48);
            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            pos++;
            if (pos == len) break;

            dig = s.charAt(pos);
        }

        return (int) (sign * res);
    }
}