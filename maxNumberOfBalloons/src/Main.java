import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(maxNumberOfBalloons("leetcode"));
        System.out.println(maxNumberOfBalloons("l"));
    }

    public static int maxNumberOfBalloons(String text) {
        if (text.length() < 7) return 0;

        int[] balloon = new int[5];
        char[] chars = text.toCharArray();

        for (char elm : chars)
            switch (elm) {
                case 'b' -> balloon[0]++;
                case 'a' -> balloon[1]++;
                case 'l' -> balloon[2]++;
                case 'o' -> balloon[3]++;
                case 'n' -> balloon[4]++;
            }

        balloon[2] /= 2;
        balloon[3] /= 2;

        return Arrays.stream(balloon).summaryStatistics().getMin();
    }
}