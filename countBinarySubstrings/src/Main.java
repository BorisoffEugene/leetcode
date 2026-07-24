public class Main {
    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
        System.out.println(countBinarySubstrings("10101"));
    }

    public static int countBinarySubstrings(String s) {
        int res = 0;
        int prev = 0;
        int curr = 1;
        char[] chars = s.toCharArray();

        for (int i = 1; i < chars.length; i++)
            if (chars[i] == chars[i - 1])
                curr++;
            else {
                res += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }

        res += Math.min(curr, prev);
        return res;
    }
}