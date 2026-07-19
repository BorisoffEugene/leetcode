public class Main {
    public static void main(String[] args) {
        System.out.println(makeSmallestPalindrome("egcfe"));
        System.out.println(makeSmallestPalindrome("abcd"));
        System.out.println(makeSmallestPalindrome("seven"));
    }

    public static String makeSmallestPalindrome(String s) {
        char[] res = s.toCharArray();
        int len = res.length;
        int end = len / 2;
        int j;

        for (int i = 0; i < end; i++) {
            j = len - i - 1;
            if (res[i] > res[j])
                res[i] = res[j];
            else if (res[i] < res[j])
                res[j] = res[i];
        }

        return new String(res);
    }
}