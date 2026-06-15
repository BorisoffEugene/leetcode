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
        int notEqCnt = 0;

        while (start < end) {
            if (chars[start] != chars[end]) {
                if (notEqCnt > 0) return false;

                notEqCnt++;

                if (chars[start + 1] != chars[end] && chars[start] != chars[end - 1]) return false;

                if (chars[start + 1] == chars[end] && chars[start + 2] == chars[end - 1])
                    start++;
                else
                    end--;
            }

            start++;
            end--;
        }

        return true;
    }
}