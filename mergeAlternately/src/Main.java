import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
    }

    public static String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        int len1 = chars1.length;

        char[] chars2 = word2.toCharArray();
        int len2 = chars2.length;

        int len3 = len1 + len2;
        char[] res = new char[len3];
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            res[2 * i] = chars1[i];
            res[2 * i + 1] = chars2[i];
        }

        if (len1 == len2) return new String(res);

        if (minLen == len2)
            System.arraycopy(chars1, minLen, res, 2 * minLen, len3 - 2 * minLen);
        else
            System.arraycopy(chars2, minLen, res, 2 * minLen, len3 - 2 * minLen);

        return new String(res);
    }
}