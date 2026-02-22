public class Main {
    public static void main(String[] args) {
        System.out.println(convertToBase7(100));
        System.out.println(convertToBase7(-7));
    }

    public static String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
}