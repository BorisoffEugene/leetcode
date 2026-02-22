public class Main {
    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[] {1,4}, 2));
        System.out.println(findPoisonedDuration(new int[] {1,2}, 2));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if (duration == 0) return 0;

        int res = duration;
        int len = timeSeries.length;

        for (int i = 1; i < len; i++)
            res = res + Math.min(0, timeSeries[i] - timeSeries[i - 1] - duration) + duration;

        return res;
    }
}