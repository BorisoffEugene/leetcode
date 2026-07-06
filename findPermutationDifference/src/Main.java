import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abc", "bac"));
        System.out.println(findPermutationDifference("abcde", "edbac"));
    }

    public static int findPermutationDifference(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int[] res = new int[26];
        int sum = 0;

        for (int i = 0; i < charS.length; i++)
            res[charS[i] - 'a'] = i;

        for (int i = 0; i < charT.length; i++)
            sum += Math.abs(res[charT[i] - 'a'] - i);

        return sum;
    }
}