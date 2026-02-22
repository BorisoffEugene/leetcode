public class Main {
    public static void main(String[] args) {
        System.out.println(haveConflict(new String[]{"01:15","02:00"}, new String[]{"02:00","03:00"}));
        System.out.println(haveConflict(new String[]{"01:00","02:00"}, new String[]{"01:20","03:00"}));
        System.out.println(haveConflict(new String[]{"10:00","11:00"}, new String[]{"14:00","15:00"}));
    }

    public static boolean haveConflict(String[] event1, String[] event2) {
        int start1 = eventToInt(event1[0]);
        int end1 = eventToInt(event1[1]);
        int start2 = eventToInt(event2[0]);
        int end2 = eventToInt(event2[1]);

        return start2 <= end1 && end2 >= start1;
    }

    public static int eventToInt(String event) {
        return Integer.parseInt(event.substring(0, 2)) * 60 + Integer.parseInt(event.substring(3, 5));
    }
}