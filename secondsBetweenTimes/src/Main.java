public class Main {
    public static void main(String[] args) {
        System.out.println(secondsBetweenTimes("01:00:00", "01:00:25"));
        System.out.println(secondsBetweenTimes("12:34:56", "13:00:00"));
    }

    public static int secondsBetweenTimes(String startTime, String endTime) {
        return convert(endTime) - convert(startTime);
    }

    public static int convert(String time) {
        char[] chars = time.toCharArray();
        int res = 0;

        res = res +
                (chars[0] - '0') * 36_000 + (chars[1] - '0') * 3_600 +
                (chars[3] - '0') * 600 + (chars[4] - '0') * 60 +
                (chars[6] - '0') * 10 + (chars[7] - '0');

        return res;
    }
}