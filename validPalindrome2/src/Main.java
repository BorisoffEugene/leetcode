public class Main {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("abca"));
        System.out.println(validPalindrome("abc"));
        System.out.println(validPalindrome("deeee"));
        System.out.println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }

    public static boolean validPalindrome(String s) {
        int len = s.length();
        if (len < 3) return true;

        int start = 0;
        int end = len - 1;
        char[] chars = s.toCharArray();

        while (start < end) {
            if (chars[start] != chars[end])
                return isPal(chars, start + 1, end) || isPal(chars, start, end - 1);

            start++;
            end--;
        }

        return true;
    }

    public static boolean isPal(char[] chars, int start, int end) {
        while (start < end) {
            if (chars[start] != chars[end])
                return false;

            start++;
            end--;
        }

        return true;
    }
}