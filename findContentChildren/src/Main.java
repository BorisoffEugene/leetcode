import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[] {1,2,3}, new int[] {1,1}));
    }

    public static int findContentChildren(int[] g, int[] s) {
        int lenS = s.length;
        if (lenS == 0) return 0;

        int lenG = g.length;

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;

        while (i < lenG && j < lenS) {
            if (g[i] <= s[j]) i++;
            j++;
        }

        return i;
    }
}