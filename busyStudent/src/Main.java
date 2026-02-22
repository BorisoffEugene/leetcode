public class Main {
    public static void main(String[] args) {
        System.out.println(busyStudent(new int[] {1,2,3}, new int[] {3,2,7}, 4));
        System.out.println(busyStudent(new int[] {4}, new int[] {4}, 4));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int len = startTime.length;
        int res = 0;

        for (int i = 0; i < len; i++)
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) res++;

        return res;
    }
}