import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
        System.out.println(Arrays.toString(shortestToChar("aaab", 'b')));
    }

    public static int[] shortestToChar(String s, char c) {
        int len = s.length();
        if (len == 1) return new int[]{0};
        int[] res = new int[len];

        for (int i = 0; i < len; i++) {
            int pos1 = s.substring(0, i).lastIndexOf(c);
            int pos2 = s.substring(i).indexOf(c);

            res[i] = Math.min(
                    Math.abs((pos1 == -1 ? Integer.MAX_VALUE : pos1) - i),
                    Math.abs((pos2 == -1 ? Integer.MAX_VALUE : pos2 + i) - i)
                    );
        }

        return res;
    }
}