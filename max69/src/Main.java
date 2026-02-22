public class Main {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
        System.out.println(maximum69Number(9996));
        System.out.println(maximum69Number(9999));
    }

    public static int maximum69Number (int num) {
        return Integer.parseInt(Integer.toString(num).replaceFirst("6", "9"));
    }
}