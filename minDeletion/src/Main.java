import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(minDeletion("abc", 2));
        System.out.println(minDeletion("aabb", 2));
        System.out.println(minDeletion("yyyzz", 1));
    }

    public static int minDeletion(String s, int k) {
        int[] freq = new int[26];
        int cntDist = 0;
        char[] chars = s.toCharArray();

        for (char c : chars) {
            freq[c - 'a']++;
            if (freq[c - 'a'] == 1) cntDist++;
        }

        if (cntDist <= k) return 0;

        Arrays.sort(freq);

        int diff = cntDist - k;
        int sum = 0;
        for (int i = 0; i < 26; i++)
            if (freq[i] > 0) {
                sum+= freq[i];
                diff--;
                if (diff == 0) break;
            }

        return sum;
    }
}