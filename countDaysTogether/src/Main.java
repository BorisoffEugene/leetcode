import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println(countDaysTogether("08-15", "08-18", "08-16", "08-19"));
        System.out.println(countDaysTogether("10-01", "10-31", "11-01", "12-31"));
    }

    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        LocalDate arriveAliceDate = LocalDate.parse("2025-" + arriveAlice);
        LocalDate leaveAliceDate = LocalDate.parse("2025-" + leaveAlice);
        LocalDate arriveBobDate = LocalDate.parse("2025-" + arriveBob);
        LocalDate leaveBobDate = LocalDate.parse("2025-" + leaveBob);

        LocalDate start = arriveAliceDate.isBefore(arriveBobDate) ? arriveBobDate : arriveAliceDate;
        LocalDate end = leaveAliceDate.isBefore(leaveBobDate) ? leaveAliceDate : leaveBobDate;

        int res = (int) ChronoUnit.DAYS.between(start, end);
        return Math.max(0, res + 1);
    }
}