public class Main {
    public static void main(String[] args) {
        System.out.println(minTimeToType("abc"));
        System.out.println(minTimeToType("bza"));
        System.out.println(minTimeToType("zjpc"));
    }

    public static int minTimeToType(String word) {
        char[] chars = word.toCharArray();
        int res = chars.length + minTimeToMove('a', chars[0]);

        for (int i = 1; i < chars.length; i++)
            res += minTimeToMove(chars[i - 1], chars[i]);

        return res;
    }

    public static int minTimeToMove(char cur, char next) {
        int time1 = Math.abs(next - cur);
        int time2 = 26 - Math.abs(next - cur);
        return Math.min(time1, time2);
    }
}