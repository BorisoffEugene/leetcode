public class Main {
    public static void main(String[] args) {
        System.out.println(maximumTime("2?:?0"));
        System.out.println(maximumTime("0?:3?"));
        System.out.println(maximumTime("1?:22"));
        System.out.println(maximumTime("?0:15"));
    }

    public static String maximumTime(String time) {
        char[] chars = time.toCharArray();

        if (chars[4] == '?') chars[4] = '9';

        if (chars[3] == '?') chars[3] = '5';

        if (chars[1] == '?') {
            if (chars[0] == '2' || chars[0] == '?')
                chars[1] = '3';
            else
                chars[1] = '9';
        }

        if (chars[0] == '?') {
            if (chars[1] < '4')
                chars[0] = '2';
            else
                chars[0] = '1';
        }

        return new String(chars);
    }
}