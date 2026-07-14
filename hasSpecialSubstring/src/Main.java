public class Main {
    public static void main(String[] args) {
        System.out.println(hasSpecialSubstring("aaabaaa", 3));
        System.out.println(hasSpecialSubstring("abc", 2));
    }

    public static boolean hasSpecialSubstring(String s, int k) {
        char[] chars = s.toCharArray();
        int len = 1;

        for (int i = 1; i < chars.length; i++)
            if (chars[i] == chars[i - 1])
                len++;
            else {
                if (len == k) return true;
                len = 1;
            }

        return len == k;
    }
}