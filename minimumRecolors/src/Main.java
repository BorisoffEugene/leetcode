public class Main {
    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBBWWBBWBW", 7));
        System.out.println(minimumRecolors("WBWBBBW", 2));
    }

    public static int minimumRecolors(String blocks, int k) {
        char[] chars = blocks.toCharArray();
        int cnt = 0;

        for (int i = 0; i < k; i++)
            if (chars[i] == 'W') cnt++;

        int min = cnt;
        if (min == 0) return 0;

        for (int i = k; i < chars.length; i++) {
            if (chars[i - k] == 'W') cnt--;
            if (chars[i] == 'W') cnt++;
            if (min > cnt) min = cnt;
            if (min == 0) return 0;
        }

        return min;
    }
}