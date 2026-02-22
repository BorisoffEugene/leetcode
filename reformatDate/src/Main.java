public class Main {
    public static void main(String[] args) {
        System.out.println(reformatDate("20th Oct 2052"));
        System.out.println(reformatDate("6th Jun 1933"));
        System.out.println(reformatDate("26th May 1960"));
    }

    public static String reformatDate(String date) {
        String[] arr = date.split(" ");

        return arr[2] + "-" + getMonth(arr[1]) + "-" + getDay(arr[0]);
    }

    private static String getMonth(String month) {
        return switch (month) {
            case "Jan" -> "01";
            case "Feb" -> "02";
            case "Mar" -> "03";
            case "Apr" -> "04";
            case "May" -> "05";
            case "Jun" -> "06";
            case "Jul" -> "07";
            case "Aug" -> "08";
            case "Sep" -> "09";
            case "Oct" -> "10";
            case "Nov" -> "11";
            case "Dec" -> "12";
            default -> "";
        };
    }

    private static String getDay(String day) {
        return String.format("%02d", Integer.parseInt(day.replaceAll("\\D+", "")));
    }
}