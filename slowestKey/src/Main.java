public class Main {
    public static void main(String[] args) {
        System.out.println(slowestKey(new int[] {9,29,49,50}, "cbcd"));
        System.out.println(slowestKey(new int[] {12,23,36,46,62}, "spuda"));
    }

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int len = releaseTimes.length;
        int max = releaseTimes[0];
        char res = keysPressed.charAt(0);
        int diff;

        for (int i = 1; i < len; i++) {
            diff = releaseTimes[i] - releaseTimes[i - 1];
            if (diff > max) {
                max = diff;
                res = keysPressed.charAt(i);
            } else if (diff == max && keysPressed.charAt(i) > res)
                res = keysPressed.charAt(i);
        }

        return res;
    }
}