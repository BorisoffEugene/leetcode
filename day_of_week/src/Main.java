import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(31, 8, 2019));
        System.out.println(dayOfTheWeek(18, 7, 1999));
        System.out.println(dayOfTheWeek(15, 8, 1993));
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}