public class Main {
    public static void main(String[] args) {
        System.out.println(possibleStringCount("abbcccc"));
        System.out.println(possibleStringCount("abcd"));
        System.out.println(possibleStringCount("aaaa"));
        System.out.println(possibleStringCount("ere"));
    }

    public static int possibleStringCount(String word) {
        char[] chars = word.toCharArray();
        int res = 1;

        for (int i = 1; i < chars.length; i++)
            if (chars[i] == chars[i - 1]) res++;

        return res;
    }
}