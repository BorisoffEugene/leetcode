public class Main {
    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1"));
        System.out.println(squareIsWhite("h3"));
        System.out.println(squareIsWhite("c7"));
    }

    public static boolean squareIsWhite(String coordinates) {
        return coordinates.charAt(0) % 2 != coordinates.charAt(1) % 2;
    }
}