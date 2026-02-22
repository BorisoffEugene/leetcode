public class Main {
    public static void main(String[] args) {
        System.out.println(convertDateToBinary("2080-02-29"));
        System.out.println(convertDateToBinary("1900-01-01"));
    }

    public static String convertDateToBinary(String date) {
        String year = Integer.toBinaryString(Integer.parseInt(date.substring(0, 4)));
        String month = Integer.toBinaryString(Integer.parseInt(date.substring(5, 7)));
        String day = Integer.toBinaryString(Integer.parseInt(date.substring(8)));

        return String.join("-", year, month, day);
    }
}