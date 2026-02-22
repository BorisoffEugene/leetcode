import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxDifference("aaaaabbc"));
        System.out.println(maxDifference("abcabcab"));
        System.out.println(maxDifference("yzyyys"));
    }

    public static int maxDifference(String s) {
        int[] arr = new int[26];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (char c : s.toCharArray())
            arr[c - 'a']++;

        for (int i = 0; i < 26; i++)
            if (arr[i] % 2 == 1) {
                if (arr[i] > max) max = arr[i];
            } else if (arr[i] != 0) {
                if (arr[i] < min) min = arr[i];
            }

        return max - min;
    }
}