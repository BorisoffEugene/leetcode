import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-01-09"));
        System.out.println(dayOfYear("2019-02-10"));
    }

    public static int dayOfYear(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd")).getDayOfYear();
    }
}