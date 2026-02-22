public class Main {
    public static void main(String[] args) {
        System.out.println(checkTwoChessboards("a1", "c3"));
        System.out.println(checkTwoChessboards("a1", "h3"));
    }

    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return (coordinate1.charAt(0) + coordinate1.charAt(1)) % 2 == (coordinate2.charAt(0) + coordinate2.charAt(1)) % 2;
    }
}