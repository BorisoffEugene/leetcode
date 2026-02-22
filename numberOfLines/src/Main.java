import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfLines(new int[] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz")));
        System.out.println(Arrays.toString(numberOfLines(new int[] {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa")));
    }

    public static int[] numberOfLines(int[] widths, String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        int cnt = 1;
        int cur;

        for (char c : chars) {
            cur = widths[c - 'a'];
            sum += cur;
            if (sum > 100) {
                sum = cur;
                cnt++;
            }
        }

        return new int[]{cnt, sum};
    }
}