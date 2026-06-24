public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameDigits("3902"));
        System.out.println(hasSameDigits("34789"));
    }

    public static boolean hasSameDigits(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length - 2; i++)
            for (int j = 0; j < chars.length - i - 1; j++)
                chars[j] = (char) (((chars[j] - '0') + (chars[j + 1] - '0')) % 10 + '0');

        return chars[0] == chars[1];
    }
}