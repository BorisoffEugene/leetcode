public class Main {
    public static void main(String[] args) {
        System.out.println(getSmallestString("45320"));
        System.out.println(getSmallestString("001"));
    }

    public static String getSmallestString(String s) {
        char[] chars = s.toCharArray();
        char tmp;

        for (int i = 0; i < chars.length - 1; i++)
            if ((chars[i] & 1) == (chars[i + 1] & 1) && chars[i] > chars[i + 1]) {
                tmp = chars[i];
                chars[i] = chars[i + 1];
                chars[i + 1] = tmp;
                break;
            }

        return new String (chars);
    }
}