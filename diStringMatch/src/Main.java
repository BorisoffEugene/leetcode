import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("IDID")));
        System.out.println(Arrays.toString(diStringMatch("III")));
        System.out.println(Arrays.toString(diStringMatch("DDI")));
    }

    public static int[] diStringMatch(String s) {
        int len = s.length();
        int max = len;
        int min = 0;
        int[] res = new int[len + 1];

        for (int i = 0; i < len; i++)
            if (s.charAt(i) == 'I') {
                res[i] = min;
                min++;
            } else {
                res[i] = max;
                max--;
            }

        res[len] = max;

        return res;
    }
}