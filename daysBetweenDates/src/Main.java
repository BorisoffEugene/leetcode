import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println(daysBetweenDates("1971-06-29", "2010-09-23"));
    }

    public static int daysBetweenDates(String date1, String date2) {
        return Math.abs((int) ChronoUnit.DAYS.between(LocalDate.parse(date1), LocalDate.parse(date2)));
    }
}