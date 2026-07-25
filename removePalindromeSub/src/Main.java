public class Main {
    public static void main(String[] args) {
        System.out.println(removePalindromeSub("ababa"));
        System.out.println(removePalindromeSub("abb"));
        System.out.println(removePalindromeSub("baabb"));
    }

    public static int removePalindromeSub(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length - 1;
        int end = chars.length / 2;

        for (int i = 0; i < end; i++)
            if (chars[i] != chars[len - i]) return 2;

        return 1;
    }
}