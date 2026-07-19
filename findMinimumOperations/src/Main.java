public class Main {
    public static void main(String[] args) {
        System.out.println(findMinimumOperations("abc", "abb", "ab"));
        System.out.println(findMinimumOperations("dac", "bac", "cac"));
    }

    public static int findMinimumOperations(String s1, String s2, String s3) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] c3 = s3.toCharArray();

        int end = Math.min(Math.min(c1.length, c2.length), c3.length);

        int maxLen = 0;
        for (int i = 0; i < end; i++)
            if (c1[i] == c2[i] && c2[i] == c3[i])
                maxLen++;
            else
                break;

        if (maxLen == 0) return -1;

        int res = 0;
        if (c1.length > maxLen) res += c1.length - maxLen;
        if (c2.length > maxLen) res += c2.length - maxLen;
        if (c3.length > maxLen) res += c3.length - maxLen;

        return res;
    }
}