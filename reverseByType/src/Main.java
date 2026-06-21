public class Main {
    public static void main(String[] args) {
        System.out.println(reverseByType(")ebc#da@f("));
        System.out.println(reverseByType("z"));
        System.out.println(reverseByType("!@#$%^&*()"));
    }

    public static String reverseByType(String s) {
        char[] chars = s.toCharArray();
        char tmp;

        int start = nextStartL(-1, chars);
        int end = nextEndL(chars.length, chars);

        while (start < end) {
            tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;

            start = nextStartL(start, chars);
            end = nextEndL(end, chars);
        }

        start = nextStartNL(-1, chars);
        end = nextEndNL(chars.length, chars);

        while (start < end) {
            tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;

            start = nextStartNL(start, chars);
            end = nextEndNL(end, chars);
        }

        return new String(chars);
    }

    public static int nextStartL(int startL, char[] chars) {
        for (int i = startL + 1; i < chars.length - 1; i++)
            if ("!@#$%^&*()".indexOf(chars[i]) == -1)
                return i;

        return chars.length;
    }

    public static int nextStartNL(int startNL, char[] chars) {
        for (int i = startNL + 1; i < chars.length - 1; i++)
            if ("!@#$%^&*()".indexOf(chars[i]) > -1)
                return i;

        return chars.length;
    }

    public static int nextEndL(int endL, char[] chars) {
        for (int i = endL - 1; i > 0; i--)
            if ("!@#$%^&*()".indexOf(chars[i]) == -1)
                return i;

        return 0;
    }

    public static int nextEndNL(int endNL, char[] chars) {
        for (int i = endNL - 1; i > 0; i--)
            if ("!@#$%^&*()".indexOf(chars[i]) > -1)
                return i;

        return 0;
    }
}