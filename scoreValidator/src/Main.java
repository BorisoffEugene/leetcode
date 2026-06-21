import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(scoreValidator(new String[]{"1", "4", "W", "6", "WD"})));
        System.out.println(Arrays.toString(scoreValidator(new String[]{"WD", "NB", "0", "4", "4"})));
        System.out.println(Arrays.toString(scoreValidator(new String[]{"W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W"})));
    }

    public static int[] scoreValidator(String[] events) {
        int[] res = new int[2];

        for (String event : events) {
            switch (event) {
                case "1", "WD", "NB" -> res[0]++;
                case "2" -> res[0] += 2;
                case "3" -> res[0] += 3;
                case "4" -> res[0] += 4;
                case "5" -> res[0] += 5;
                case "6" -> res[0] += 6;
                case "W" -> res[1]++;
            }

            if (res[1] == 10) return res;
        }

        return res;
    }
}