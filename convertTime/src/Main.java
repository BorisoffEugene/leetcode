public class Main {
    public static void main(String[] args) {
        System.out.println(convertTime("02:30", "04:35"));
        System.out.println(convertTime("11:00", "11:01"));
    }

    public static int convertTime(String current, String correct) {
        if (current.equals(correct)) return 0;

        int curMin = strToMin(current);
        int corMin = strToMin(correct);
        int diff = corMin - curMin;
        int[] steps = new int[] {60, 15, 5, 1};

        int res = 0;
        int tmp;
        for (int i = 0; i < 4 && diff > 0; i++) {
            tmp = diff / steps[i];
            res += tmp;
            diff -= tmp * steps[i];
        }

        return res;
    }

    public static int strToMin(String val) {
        int h = Integer.parseInt(val.substring(0, 2)) * 60;
        int m = Integer.parseInt(val.substring(3));

        return h + m;
    }
}